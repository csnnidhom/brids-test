package com.dev.bridstest.controller;

import com.dev.bridstest.dto.ResponseFailed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ResponseFailed> apiException(ResponseStatusException exception){
        return ResponseEntity.status(exception.getStatusCode())
                .body(ResponseFailed.builder().error(exception.getReason()).build());
    }
}
