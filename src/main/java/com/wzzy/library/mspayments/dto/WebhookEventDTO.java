package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebhookEventDTO {

    private Long webhookEventIdDTO;
    private Long paymentIdDTO;
    private String eventTypeDTO;
    private String payloadDTO;
    private LocalDateTime receivedDateDTO;
    private Boolean processedDTO;
}
