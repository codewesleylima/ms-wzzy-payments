package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckDTO {

    private Long fraudCheckResultIdDTO;
    private Long paymentIdDTO;
    private Integer fraudScoreDTO;
    private String fraudLevelDTO;
    private String riskFactorsDTO;
    private LocalDateTime checkDateDTO;
}
