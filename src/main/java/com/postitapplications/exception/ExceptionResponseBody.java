package com.postitapplications.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

public class ExceptionResponseBody {
    final private HttpStatus httpStatus;
    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    final private LocalDateTime timestamp;
    final private String message;

    public ExceptionResponseBody(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public LocalDateTime getTimeStamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
