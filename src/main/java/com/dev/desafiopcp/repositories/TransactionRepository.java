package com.dev.desafiopcp.repositories;

import com.dev.desafiopcp.entities.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
