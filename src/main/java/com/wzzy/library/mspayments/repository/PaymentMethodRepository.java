package com.wzzy.library.mspayments.repository;

import com.wzzy.library.mspayments.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, String> {
    List<PaymentMethod> findByCustomerId(String customerId);
    Optional<PaymentMethod> findByCustomerIdAndIsDefaultTrue(String customerId);
    List<PaymentMethod> findByCustomerIdAndIsActiveTrue(String customerId);
}
