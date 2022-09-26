package com.lastcivilization.paymentreadservice.domain;

import com.lastcivilization.paymentreadservice.domain.exception.AccountNotFoundException;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.view.AccountModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private PaymentService underTest;

    @Test
    void shouldGetAccountById() {
        //given
        AccountModel expectedAccountModel = new AccountModel(
                0L,
                0
        );
        when(accountRepository.findById(anyLong())).thenReturn(Optional.of(expectedAccountModel));
        //when
        AccountModel accountModel = underTest.getAccountById(anyLong());
        //then
        assertThat(accountModel).isEqualTo(expectedAccountModel);
    }

    @Test
    void shouldThrowAccountNotFoundExceptionWhileGettingAccountById() {
        //given
        when(accountRepository.findById(anyLong())).thenReturn(Optional.empty());
        //when
        Executable getExecutable = () -> underTest.getAccountById(anyLong());
        //then
        assertThrows(AccountNotFoundException.class, getExecutable);
    }
}