package com.gktech.bankaccount.service;

import com.gktech.bankaccount.exception.CustomerNotFoundException;
import com.gktech.bankaccount.model.Customer;
import com.gktech.bankaccount.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id)
                .orElseThrow( () -> new CustomerNotFoundException("Customer could not found by id: " + id));
    }
}
