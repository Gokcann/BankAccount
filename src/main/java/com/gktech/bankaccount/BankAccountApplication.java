package com.gktech.bankaccount;

import com.gktech.bankaccount.model.Account;
import com.gktech.bankaccount.model.Customer;
import com.gktech.bankaccount.repository.CustomerRepository;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;

@SpringBootApplication
public class BankAccountApplication implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BankAccountApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BankAccountApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Account a = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
        //Account b = new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
        Customer customer = customerRepository.save(new Customer("","Gokcan","Akoya",new HashSet<>()));
        System.out.println(customer);
    }
}
