package com.poorna.student.Management.exception;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime timestamp;
    private Integer status;
    private String message;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse(String message, Integer status){
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }
}
