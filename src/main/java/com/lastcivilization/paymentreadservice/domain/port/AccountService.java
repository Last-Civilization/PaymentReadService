package com.lastcivilization.paymentreadservice.domain.port;

import com.lastcivilization.paymentreadservice.domain.Account;

public interface AccountService {

    Account getAccountById(Long id);
}
