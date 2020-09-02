package com.postitapplications.exception.exceptions;

public class UsernameTakenException extends RuntimeException {

    public UsernameTakenException(String errorMessage) {
        super(errorMessage);
    }
}
