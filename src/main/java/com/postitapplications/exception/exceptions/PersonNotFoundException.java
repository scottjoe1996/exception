package com.postitapplications.exception.exceptions;

public class PersonNotFoundException extends NullPointerException {

    public PersonNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
