package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethodDTO {

    private Long paymentMethodIdDTO;
    private Long customerIdDTO;
    private String cardLastFourDigitsDTO;
    private String cardTypeDTO;
    private Integer expiryMonthDTO;
    private Integer expiryYearDTO;
    private Boolean isDefaultDTO;
}
