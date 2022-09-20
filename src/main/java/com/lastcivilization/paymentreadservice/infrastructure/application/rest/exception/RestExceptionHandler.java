package com.lastcivilization.paymentreadservice.infrastructure.application.rest.exception;

import com.lastcivilization.paymentreadservice.domain.exception.AccountNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
class RestExceptionHandler {

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    ErrorEntity handleAccountNotFoundException(AccountNotFoundException exception){
        return new ErrorEntity(exception.getMessage());
    }
}
