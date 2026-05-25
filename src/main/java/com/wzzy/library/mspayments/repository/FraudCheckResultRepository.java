package com.wzzy.library.mspayments.repository;

import com.wzzy.library.mspayments.entity.FraudCheckResult;
import com.wzzy.library.mspayments.enums.FraudLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FraudCheckResultRepository extends JpaRepository<FraudCheckResult, String> {
    Optional<FraudCheckResult> findByPaymentId(String paymentId);
    List<FraudCheckResult> findByFraudLevel(FraudLevel fraudLevel);
    List<FraudCheckResult> findByApprovedFalse();
}
