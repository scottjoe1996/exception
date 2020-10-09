package com.postitapplications.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestClientException;

public class ExternalServiceException extends RestClientException {
    private final HttpStatus statusCode;

    public ExternalServiceException(HttpStatus statusCode, String errorMessage) {
        super(errorMessage);
        this.statusCode = statusCode;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}
