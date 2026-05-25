package com.wzzy.library.mspayments.dto;

import com.wzzy.library.mspayments.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDTO {
    private String id;
    private String customerId;
    private PaymentType type;
    private String cardNumber;
    private String cardHolderName;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
    private String maskedCardNumber;
    private String pixKey;
    private String pixKeyType;
    private boolean isDefault;
    private boolean isActive;
    private String createdAt;
    private String updatedAt;
}
