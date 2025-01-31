package com.receipt.Receipt_Processor.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    // handles exception IllegalArgumentException and returns 404 response
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleException(IllegalArgumentException exp) {
        return ResponseEntity.badRequest().body(exp.getMessage());
    }
}
