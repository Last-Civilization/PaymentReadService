package com.lastcivilization.paymentreadservice.domain;

import com.lastcivilization.paymentreadservice.domain.exception.AccountNotFoundException;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.port.AccountService;

public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }
}
