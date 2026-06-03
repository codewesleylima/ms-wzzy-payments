package com.wzzy.library.mspayments.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_check_results")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fraudCheckResultId;

    @OneToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @Column(nullable = false)
    private Integer fraudScore;

    @Column(nullable = false)
    private String fraudLevel;

    @Column(length = 2000)
    private String riskFactors;

    @Column(nullable = false)
    private LocalDateTime checkDate = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
