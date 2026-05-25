package com.wzzy.library.mspayments.service;

import com.wzzy.library.mspayments.dto.FraudCheckDTO;
import com.wzzy.library.mspayments.dto.PaymentDTO;

public interface FraudCheckService {
    FraudCheckDTO performFraudCheck(PaymentDTO paymentDTO);
    FraudCheckDTO getFraudCheckByPaymentId(String paymentId);
    boolean isPaymentApproved(String paymentId);
    double calculateRiskScore(PaymentDTO paymentDTO);
    void blockHighRiskPayments();
}
