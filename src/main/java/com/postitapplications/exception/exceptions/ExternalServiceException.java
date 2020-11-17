package com.postitapplications.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestClientException;

public class ExternalServiceException extends RestClientException {
    private final HttpStatus statusCode;
    private final String responseAsString;

    public ExternalServiceException(HttpStatus statusCode, String errorMessage, String responseAsString) {
        super(errorMessage);
        this.statusCode = statusCode;
        this.responseAsString = responseAsString;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getResponseAsString() {
        return responseAsString;
    }
}
