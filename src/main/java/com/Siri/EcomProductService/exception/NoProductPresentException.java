package com.Siri.EcomProductService.exception;

public class NoProductPresentException extends RuntimeException{
    public NoProductPresentException() {
        super();
    }

    public NoProductPresentException(String message) {
        super(message);
    }

    public NoProductPresentException(String message, Throwable cause) {
        super(message, cause);
    }
}
