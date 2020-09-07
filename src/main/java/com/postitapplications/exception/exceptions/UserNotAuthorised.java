package com.postitapplications.exception.exceptions;

public class UserNotAuthorised extends RuntimeException {

    public UserNotAuthorised(String errorMessage) {
        super(errorMessage);
    }
}
