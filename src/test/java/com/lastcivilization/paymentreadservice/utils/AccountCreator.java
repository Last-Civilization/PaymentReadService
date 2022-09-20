package com.lastcivilization.paymentreadservice.utils;

import com.lastcivilization.paymentreadservice.domain.Account;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountCreator {

    private final AccountRepository accountRepository;

    public Account createAccount(int money){
        Account account = Account.Builder.anAccount()
                .money(money)
                .build();
        return accountRepository.save(account);
    }
}
