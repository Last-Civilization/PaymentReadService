package com.lastcivilization.paymentreadservice.domain.port;

import com.lastcivilization.paymentreadservice.domain.Account;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface AccountRepository {

    Optional<Account> findById(Long id);
}
