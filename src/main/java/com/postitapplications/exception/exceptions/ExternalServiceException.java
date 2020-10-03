package com.postitapplications.exception.exceptions;

import org.springframework.http.HttpStatus;

public class ExternalServiceException extends RuntimeException {
    private final HttpStatus statusCode;

    public ExternalServiceException(HttpStatus statusCode, String errorMessage) {
        super(errorMessage);
        this.statusCode = statusCode;
    }

    private HttpStatus getStatusCode() {
        return statusCode;
    }
}
