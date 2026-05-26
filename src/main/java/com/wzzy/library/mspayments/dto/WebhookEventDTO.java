package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebhookEventDTO {

    private Long id;
    private Long paymentId;
    private String eventType;
    private String payload;
    private LocalDateTime receivedDate;
    private Boolean processed;
}
