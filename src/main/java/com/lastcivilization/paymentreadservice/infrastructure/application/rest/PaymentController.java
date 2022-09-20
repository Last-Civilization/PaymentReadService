package com.lastcivilization.paymentreadservice.infrastructure.application.rest;

import com.lastcivilization.paymentreadservice.domain.Account;
import com.lastcivilization.paymentreadservice.domain.port.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{id}")
    Account getAccountById(@PathVariable long id){
        return paymentService.getAccountById(id);
    }
}
