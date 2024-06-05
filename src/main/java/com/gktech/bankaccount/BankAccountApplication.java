package com.gktech.bankaccount;

import com.gktech.bankaccount.model.Account;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class BankAccountApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
        Account b = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
    }
}
