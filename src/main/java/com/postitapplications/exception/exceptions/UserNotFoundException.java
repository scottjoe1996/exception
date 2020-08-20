package com.postitapplications.exception.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
