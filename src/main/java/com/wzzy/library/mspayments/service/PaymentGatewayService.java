package com.wzzy.library.mspayments.service;

import com.wzzy.library.mspayments.dto.PaymentDTO;
import com.wzzy.library.mspayments.dto.TransactionDTO;

public interface PaymentGatewayService {
    TransactionDTO processPixPayment(PaymentDTO paymentDTO);
    TransactionDTO processCardPayment(PaymentDTO paymentDTO);
    TransactionDTO authorizeTransaction(String paymentId);
    TransactionDTO captureTransaction(String transactionId);
    TransactionDTO refundTransaction(String transactionId);
    void validatePaymentMethod(String paymentMethodId);
}
