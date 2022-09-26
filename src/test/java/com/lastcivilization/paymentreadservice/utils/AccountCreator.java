package com.lastcivilization.paymentreadservice.utils;

import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountCreator {

    private final AccountRepository accountRepository;

    public AccountModel createAccount(int money){
        AccountModel account = new AccountModel(
                null,
                money
        );
        return accountRepository.save(account);
    }
}
