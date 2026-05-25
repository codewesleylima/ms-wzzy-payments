package com.wzzy.library.mspayments.repository;

import com.wzzy.library.mspayments.entity.Transaction;
import com.wzzy.library.mspayments.enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {
    Optional<Transaction> findByTransactionCode(String transactionCode);
    List<Transaction> findByPaymentId(String paymentId);
    List<Transaction> findByStatus(TransactionStatus status);
    List<Transaction> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
}
