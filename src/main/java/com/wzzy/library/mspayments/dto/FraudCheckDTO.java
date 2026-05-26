package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckDTO {

    private Long id;
    private Long paymentId;
    private Integer fraudScore;
    private String fraudLevel;
    private String riskFactors;
    private LocalDateTime checkDate;
}
