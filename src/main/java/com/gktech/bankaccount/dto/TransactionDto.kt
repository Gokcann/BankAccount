package com.gktech.bankaccount.dto

import com.gktech.bankaccount.model.TransactionType
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id: String?,
        val transactionType: TransactionType? = TransactionType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?,
)
