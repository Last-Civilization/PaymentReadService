package com.lastcivilization.paymentreadservice.infrastructure.application.rest;

import com.lastcivilization.paymentreadservice.domain.PaymentService;
import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import com.lastcivilization.paymentreadservice.infrastructure.application.rest.dto.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

import static com.lastcivilization.paymentreadservice.infrastructure.application.rest.RestMapper.MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
@Validated
class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    AccountDto getAccountById(@PathVariable @Min(1) long id){
        AccountModel accountModel = paymentService.getAccountById(id);
        return MAPPER.toDto(accountModel);
    }
}
