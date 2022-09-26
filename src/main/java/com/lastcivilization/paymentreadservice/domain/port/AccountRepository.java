package com.lastcivilization.paymentreadservice.domain.port;

import com.lastcivilization.paymentreadservice.domain.view.AccountModel;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface AccountRepository {

    Optional<AccountModel> findById(Long id);

    AccountModel save(AccountModel account);
}
