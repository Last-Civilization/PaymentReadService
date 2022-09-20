package com.lastcivilization.paymentreadservice.domain;

import com.lastcivilization.paymentreadservice.domain.exception.AccountNotFoundException;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.port.PaymentService;

public class PaymentServiceImp implements PaymentService {

    private final AccountRepository accountRepository;

    public PaymentServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountById(long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }
}
