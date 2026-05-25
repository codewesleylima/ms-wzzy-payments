package com.wzzy.library.mspayments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebhookPayloadDTO {
    private String externalEventId;
    private String eventType;
    private String paymentReference;
    private String payload;
    private String timestamp;
}
