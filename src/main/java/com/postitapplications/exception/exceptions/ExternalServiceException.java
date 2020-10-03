package com.postitapplications.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class ExternalServiceException extends HttpClientErrorException {
    public ExternalServiceException(HttpStatus statusCode, String statusText) {
        super(statusCode, statusText);
    }
}
