package com.cs_interview_spring_boot.cs_interview_spring_boot.exception;

import org.springframework.http.HttpStatus;

public class InterviewAPIException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public InterviewAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
