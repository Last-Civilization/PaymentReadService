package com.lastcivilization.paymentreadservice.infrastructure.application.rest;

import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import com.lastcivilization.paymentreadservice.infrastructure.application.rest.dto.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface RestMapper {

    RestMapper MAPPER = Mappers.getMapper(RestMapper.class);
    
    AccountDto toDto(AccountModel accountModel);
}
