package com.lastcivilization.paymentreadservice.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

interface AccountJpaRepository extends JpaRepository<AccountEntity, Long> { }
