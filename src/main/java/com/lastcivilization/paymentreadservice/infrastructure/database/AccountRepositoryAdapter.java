package com.lastcivilization.paymentreadservice.infrastructure.database;

import com.lastcivilization.paymentreadservice.domain.Account;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.lastcivilization.paymentreadservice.infrastructure.database.EntityMapper.MAPPER;

@Service
@RequiredArgsConstructor
class AccountRepositoryAdapter implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    @Override
    public Optional<Account> findById(Long id) {
        Optional<AccountEntity> accountEntity = accountJpaRepository.findById(id);
        return accountEntity
                .map(MAPPER::toDomain);
    }

    @Override
    public Account save(Account account) {
        AccountEntity accountEntity = MAPPER.toEntity(account);
        AccountEntity savedAccountEntity = accountJpaRepository.save(accountEntity);
        return MAPPER.toDomain(savedAccountEntity);
    }
}
