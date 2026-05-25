package com.wzzy.library.mspayments.dto;

import com.wzzy.library.mspayments.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
    private String id;
    private String paymentId;
    private String transactionCode;
    private BigDecimal amount;
    private TransactionStatus status;
    private String gatewayResponse;
    private String authorizationCode;
    private String errorMessage;
    private String createdAt;
    private String processedAt;
}
