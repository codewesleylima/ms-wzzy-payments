package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    private Long transactionIdDTO;
    private Long paymentIdDTO;
    private String statusDTO;
    private String gatewayResponseDTO;
    private LocalDateTime timestampDTO;
}
