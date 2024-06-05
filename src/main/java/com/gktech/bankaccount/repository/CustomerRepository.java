package com.gktech.bankaccount.repository;

import com.gktech.bankaccount.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
