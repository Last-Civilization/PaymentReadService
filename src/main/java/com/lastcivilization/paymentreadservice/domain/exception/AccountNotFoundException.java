package com.lastcivilization.paymentreadservice.domain.exception;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(Long id) {
        super("Can not found account with id: %d".formatted(id));
    }
}
