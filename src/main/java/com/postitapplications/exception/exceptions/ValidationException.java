package com.postitapplications.exception.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException(String errorMessage) {
        super(errorMessage);
    }
}
