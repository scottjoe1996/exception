package com.postitapplications.exception.exceptions;

public class UserNotFoundException extends NullPointerException {

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
