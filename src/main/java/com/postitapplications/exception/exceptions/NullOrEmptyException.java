package com.postitapplications.exception.exceptions;

public class NullOrEmptyException extends RuntimeException {

    public NullOrEmptyException(String errorMessage) {
        super(errorMessage);
    }
}
