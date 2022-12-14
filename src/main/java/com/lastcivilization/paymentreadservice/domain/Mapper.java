package com.lastcivilization.paymentreadservice.domain;

import com.lastcivilization.paymentreadservice.domain.view.AccountModel;

final class Mapper {

    private Mapper(){
        throw new RuntimeException("You can not create instance of this class!");
    }

    static Account toDomain(AccountModel accountModel){
        return Account.Builder.anAccount()
                .id(accountModel.id())
                .money(accountModel.money())
                .build();
    }

    static AccountModel toModel(Account account){
        return new AccountModel(
                account.getId(),
                account.getMoney()
        );
    }
}
