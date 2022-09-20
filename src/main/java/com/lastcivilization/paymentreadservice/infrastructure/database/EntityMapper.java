package com.lastcivilization.paymentreadservice.infrastructure.database;

import com.lastcivilization.paymentreadservice.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    Account toDomain(AccountEntity accountEntity);
}
