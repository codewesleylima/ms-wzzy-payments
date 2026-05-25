package com.wzzy.library.mspayments.repository;

import com.wzzy.library.mspayments.entity.WebhookEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WebhookEventRepository extends JpaRepository<WebhookEvent, String> {
    Optional<WebhookEvent> findByExternalEventId(String externalEventId);
    List<WebhookEvent> findByProcessedFalse();
    List<WebhookEvent> findByPaymentReference(String paymentReference);
    List<WebhookEvent> findByEventType(String eventType);
}
