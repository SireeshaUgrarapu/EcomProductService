package com.Siri.EcomProductService.controller;

import com.Siri.EcomProductService.client.FakeStoreClient;
import com.Siri.EcomProductService.dto.fakeStoreDTOs.FakeStoreCartResponseDTO;
import com.Siri.EcomProductService.exception.CartNotFoundException;
import com.Siri.EcomProductService.exception.RandomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private FakeStoreClient fakeStoreClient;

    @GetMapping("/cart/{userId}")
    public ResponseEntity getCartForUser(@PathVariable("userId") int userId){
        List<FakeStoreCartResponseDTO> cartResponse = fakeStoreClient.getCartByUserId(userId);
        if(cartResponse == null){
            throw new CartNotFoundException("Cart not found for userID " + userId);
        }
        return ResponseEntity.ok(cartResponse);
    }

    @GetMapping("/cartexception")
    public ResponseEntity getCartException(){
        throw new RandomException("Exception from cart");
    }
}
