package com.lastcivilization.paymentreadservice.infrastructure.database;

import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    AccountModel toDomain(AccountEntity accountEntity);
    AccountEntity toEntity(AccountModel account);
}
