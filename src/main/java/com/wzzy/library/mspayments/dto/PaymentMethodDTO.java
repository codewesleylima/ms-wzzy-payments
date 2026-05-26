package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDTO {

    private Long id;
    private Long customerId;
    private String cardLastFourDigits;
    private String cardType;
    private Integer expiryMonth;
    private Integer expiryYear;
    private Boolean isDefault;
}
