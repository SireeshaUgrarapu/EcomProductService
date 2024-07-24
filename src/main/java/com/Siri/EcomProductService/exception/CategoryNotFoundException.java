package com.Siri.EcomProductService.exception;

public class CategoryNotFoundException extends ProductPresentException{
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
