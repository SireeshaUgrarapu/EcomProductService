package com.Siri.EcomProductService.service;

import com.Siri.EcomProductService.client.FakeStoreClient;
import com.Siri.EcomProductService.dto.CreateProductRequestDTO;
import com.Siri.EcomProductService.dto.ProductResponseDTO;
import com.Siri.EcomProductService.dto.fakeStoreDTOs.FakeStoreProductResponseDTO;
import com.Siri.EcomProductService.entity.Product;
import com.Siri.EcomProductService.exception.NoProductPresentException;
import com.Siri.EcomProductService.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl {
    @Autowired
    private FakeStoreClient fakeStoreClient;


    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProducts();
        if(fakeStoreProducts == null){
            throw new NoProductPresentException("No products are found");
        }
        return fakeStoreProducts;
    }

    public FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException {
        FakeStoreProductResponseDTO fakeStoreProductResponseDTO = fakeStoreClient.getProductById(productId);
        if(fakeStoreProductResponseDTO == null){
            throw new ProductNotFoundException("Product not found with id : " + productId);
        }
        return fakeStoreProductResponseDTO;
    }
    public Product createProduct(Product product) {
        return null;
    }

    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    public boolean deleteProduct(int productId) {
        return false;
    }
}
