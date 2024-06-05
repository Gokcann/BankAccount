package com.gktech.bankaccount.repository;

import com.gktech.bankaccount.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
