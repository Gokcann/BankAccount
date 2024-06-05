package com.gktech.bankaccount.dto;

import com.gktech.bankaccount.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public AccountCustomerDto convertToAccountCustomer(Customer from) {
        if (from == null) {
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(),
                from.getName(),
                from.getSurname());
    }
}
