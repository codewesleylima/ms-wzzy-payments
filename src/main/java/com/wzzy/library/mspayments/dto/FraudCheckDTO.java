package com.wzzy.library.mspayments.dto;

import com.wzzy.library.mspayments.enums.FraudLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckDTO {
    private String id;
    private String paymentId;
    private FraudLevel fraudLevel;
    private Double riskScore;
    private String riskAnalysis;
    private boolean approved;
    private String checkDetails;
    private String checkedAt;
}
