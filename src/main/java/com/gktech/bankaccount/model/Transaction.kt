package com.gktech.bankaccount.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import jdk.jfr.DataAmount
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@SequenceGenerator(name = "TR_ID", sequenceName = "TR_ID_GENERATOR")
data class Transaction(
        @Id
        @GeneratedValue(generator = "TR_ID")
        val id: String?,
        val transactionType: TransactionType? = TransactionType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?,

        @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = [CascadeType.ALL])
        @JoinColumn(name = "account_id", nullable =  false)
        val account: Account
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Transaction

        if (id != other.id) return false
        if (transactionType != other.transactionType) return false
        if (amount != other.amount) return false
        if (transactionDate != other.transactionDate) return false
        if (account != other.account) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (transactionType?.hashCode() ?: 0)
        result = 31 * result + (amount?.hashCode() ?: 0)
        result = 31 * result + (transactionDate?.hashCode() ?: 0)
        return result
    }
}

enum class TransactionType {
    INITIAL, TRANSFER
}