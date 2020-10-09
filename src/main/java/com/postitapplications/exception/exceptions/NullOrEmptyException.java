package com.postitapplications.exception.exceptions;

public class NullOrEmptyException extends ValidationException {

    public NullOrEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
