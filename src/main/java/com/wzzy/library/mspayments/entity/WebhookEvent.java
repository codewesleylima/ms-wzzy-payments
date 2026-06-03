package com.wzzy.library.mspayments.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "webhook_events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebhookEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long webhookEventIdEntity;

    @Column(nullable = false)
    private Long paymentIdEntity;

    @Column(nullable = false)
    private String eventTypeEntity;

    @Column(length = 5000)
    private String payloadEntity;

    @Column(nullable = false)
    private LocalDateTime receivedDateEntity = LocalDateTime.now();

    @Column(nullable = false)
    private Boolean processedEntity = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
