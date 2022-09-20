package com.lastcivilization.paymentreadservice.domain.port;

import com.lastcivilization.paymentreadservice.domain.Account;

public interface PaymentService {

    Account getAccountById(long id);
}
