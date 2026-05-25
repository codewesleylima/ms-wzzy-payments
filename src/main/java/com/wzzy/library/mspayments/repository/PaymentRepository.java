package com.wzzy.library.mspayments.repository;

import com.wzzy.library.mspayments.entity.Payment;
import com.wzzy.library.mspayments.enums.PaymentStatus;
import com.wzzy.library.mspayments.enums.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
    Optional<Payment> findByPaymentReference(String paymentReference);
    Optional<Payment> findByOrderId(String orderId);
    List<Payment> findByCustomerId(String customerId);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByPaymentType(PaymentType paymentType);
    List<Payment> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Payment> findByCustomerIdAndStatus(String customerId, PaymentStatus status);
}
