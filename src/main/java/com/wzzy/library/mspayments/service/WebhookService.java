package com.wzzy.library.mspayments.service;

import com.wzzy.library.mspayments.dto.WebhookPayloadDTO;

public interface WebhookService {
    void processWebhookEvent(WebhookPayloadDTO webhookPayload);
    void confirmWebhookReceipt(String externalEventId);
    void retryFailedWebhooks();
    boolean validateWebhookSignature(String payload, String signature);
}
