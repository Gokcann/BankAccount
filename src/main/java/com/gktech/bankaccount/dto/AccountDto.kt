package com.gktech.bankaccount.dto

import com.gktech.bankaccount.model.Customer
import com.gktech.bankaccount.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: String?,
        val balance: BigDecimal? = BigDecimal.ZERO,
        val creationDate: LocalDateTime,
        val customer: AccountCustomerDto?,
        val transactions: Set<TransactionDto>?
)
