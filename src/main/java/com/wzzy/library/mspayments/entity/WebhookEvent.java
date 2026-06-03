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
    private Long webhookEventId;

    @Column(nullable = false)
    private Long paymentId;

    @Column(nullable = false)
    private String eventType;

    @Column(length = 5000)
    private String payload;

    @Column(nullable = false)
    private LocalDateTime receivedDate = LocalDateTime.now();

    @Column(nullable = false)
    private Boolean processed = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
