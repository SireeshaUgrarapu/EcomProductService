package com.Siri.EcomProductService.exception;

public class ProductNotFoundException extends RuntimeException{


    public ProductNotFoundException(String message) {
        super(message);
    }


}
