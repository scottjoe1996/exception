package com.postitapplications.exception.exceptions;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
