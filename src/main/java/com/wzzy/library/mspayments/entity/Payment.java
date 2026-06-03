package com.wzzy.library.mspayments.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentIdEntity;

    @Column(nullable = false)
    private Long orderIdEntity;

    @Column(nullable = false)
    private Long customerIdEntity;

    @Column(nullable = false)
    private BigDecimal amountEntity;

    @Column(nullable = false)
    private String currencyEntity = "USD";

    @Column(nullable = false)
    private String statusEntity = "PENDING";

    private LocalDateTime paymentDateEntity;

    private String transactionIdEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "payment")
    private java.util.List<Transaction> transactionsEntity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "payment")
    private FraudCheckResult fraudCheckResultEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id")
    private java.util.List<WebhookEvent> webhookEventsEntity;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
