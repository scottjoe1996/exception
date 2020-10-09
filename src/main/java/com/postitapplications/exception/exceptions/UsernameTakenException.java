package com.postitapplications.exception.exceptions;

public class UsernameTakenException extends ValidationException {

    public UsernameTakenException(String errorMessage) {
        super(errorMessage);
    }
}
