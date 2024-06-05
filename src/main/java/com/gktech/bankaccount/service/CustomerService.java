package com.gktech.bankaccount.service;

import com.gktech.bankaccount.dto.CustomerDto;
import com.gktech.bankaccount.dto.CustomerDtoConverter;
import com.gktech.bankaccount.exception.CustomerNotFoundException;
import com.gktech.bankaccount.model.Customer;
import com.gktech.bankaccount.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id)
                .orElseThrow( () -> new CustomerNotFoundException("Customer could not found by id: " + id));
    }

    public CustomerDto getCustomerById(String customerId) {
        return converter.convertToCustomerDto(findCustomerById(customerId));
    }
}
