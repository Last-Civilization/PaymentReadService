package com.lastcivilization.paymentreadservice.infrastructure.database;

import com.lastcivilization.paymentreadservice.domain.Account;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.lastcivilization.paymentreadservice.infrastructure.database.EntityMapper.MAPPER;

@Service
@RequiredArgsConstructor
class AccountRepistoryAdapter implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    @Override
    public Optional<Account> findById(Long id) {
        Optional<AccountEntity> accountEntity = accountJpaRepository.findById(id);
        return accountEntity
                .map(MAPPER::toDomain);
    }
}
