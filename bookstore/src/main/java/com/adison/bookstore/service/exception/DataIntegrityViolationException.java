package com.adison.bookstore.service.exception;

import java.io.Serial;

public class DataIntegrityViolationException extends RuntimeException{

    @Serial
    private static final long serialVersionUID= 1L;

    public DataIntegrityViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
