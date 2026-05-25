package com.wzzy.library.mspayments.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mspayments.dto.PaymentDTO;
import com.wzzy.library.mspayments.enums.PaymentStatus;

public interface PaymentService {
    PaymentDTO createPayment(PaymentDTO paymentDTO);
    PaymentDTO getPaymentById(String id);
    PaymentDTO getPaymentByReference(String paymentReference);
    PaymentDTO getPaymentByOrderId(String orderId);
    PaginationDTO<PaymentDTO> getPaymentsByCustomerId(String customerId, int page, int size);
    PaginationDTO<PaymentDTO> getPaymentsByStatus(PaymentStatus status, int page, int size);
    PaymentDTO updatePaymentStatus(String id, PaymentStatus status);
    PaymentDTO processPayment(String paymentId);
    void refundPayment(String paymentId);
}
