package com.lastcivilization.paymentreadservice.infrastructure.application.rest;

import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import com.lastcivilization.paymentreadservice.utils.IntegrationBaseClass;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PaymentControllerTest extends IntegrationBaseClass {

    @Test
    void getAccountById() throws Exception {
        //given
        AccountModel accountModel = accountCreator.createAccount(0);
        //when
        ResultActions getResult = mockMvc.perform(get("/payments/"+accountModel.id()));
        //then
        getResult.andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(accountModel.id()))
                .andExpect(jsonPath("$.money").value(0));
    }

    @Test
    void shouldReturnNotFoundWhileGettingAccountById() throws Exception {
        //given
        //when
        ResultActions getResult = mockMvc.perform(get("/payments/-1"));
        //then
        getResult.andExpect(status().isNotFound());
    }
}