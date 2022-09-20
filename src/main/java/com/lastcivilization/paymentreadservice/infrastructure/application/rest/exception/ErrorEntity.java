package com.lastcivilization.paymentreadservice.infrastructure.application.rest.exception;

import java.time.LocalDateTime;

record ErrorEntity(
        String message,
        LocalDateTime thrownAt
){
    ErrorEntity(String message){
        this(message, LocalDateTime.now());
    }
}
