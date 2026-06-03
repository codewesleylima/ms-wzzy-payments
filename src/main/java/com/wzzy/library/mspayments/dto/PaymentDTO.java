package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Long paymentIdDTO;
    private Long orderIdDTO;
    private Long customerIdDTO;
    private BigDecimal amountDTO;
    private String currencyDTO;
    private String statusDTO;
    private LocalDateTime paymentDateDTO;
    private String transactionIdDTO;
}
