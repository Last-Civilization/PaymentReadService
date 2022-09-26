package com.lastcivilization.paymentreadservice.domain;

import com.lastcivilization.paymentreadservice.domain.exception.AccountNotFoundException;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.view.AccountModel;

public class PaymentService {

    private final AccountRepository accountRepository;

    public PaymentService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountModel getAccountById(long id) {
        AccountModel accountModel = getAccountModel(id);
        Account account = Mapper.toDomain(accountModel);
        return Mapper.toModel(account);
    }

    private AccountModel getAccountModel(long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }
}
