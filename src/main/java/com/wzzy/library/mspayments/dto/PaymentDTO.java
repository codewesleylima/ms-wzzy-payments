package com.wzzy.library.mspayments.dto;

import com.wzzy.library.mspayments.enums.PaymentStatus;
import com.wzzy.library.mspayments.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
    private String id;
    private String paymentReference;
    private String orderId;
    private String customerId;
    private BigDecimal amount;
    private PaymentType paymentType;
    private PaymentStatus status;
    private String description;
    private String externalTransactionId;
    private String merchantReference;
    private String createdAt;
    private String updatedAt;
    private String processedAt;
    private String completedAt;
}
