package com.lastcivilization.paymentreadservice.infrastructure.application.config;

import com.lastcivilization.paymentreadservice.domain.PaymentServiceImp;
import com.lastcivilization.paymentreadservice.domain.port.AccountRepository;
import com.lastcivilization.paymentreadservice.domain.port.PaymentService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.lastcivilization.paymentreadservice")
@EnableJpaRepositories("com.lastcivilization.paymentreadservice")
@ComponentScan("com.lastcivilization.paymentreadservice")
class BeanConfiguration {

    @Bean
    PaymentService paymentService(AccountRepository accountRepository){
        return new PaymentServiceImp(accountRepository);
    }
}
