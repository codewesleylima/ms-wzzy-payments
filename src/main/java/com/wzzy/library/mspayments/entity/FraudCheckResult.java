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
    private Long fraudCheckResultIdEntity;

    @OneToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment paymentEntity;

    @Column(nullable = false)
    private Integer fraudScoreEntity;

    @Column(nullable = false)
    private String fraudLevelEntity;

    @Column(length = 2000)
    private String riskFactorsEntity;

    @Column(nullable = false)
    private LocalDateTime checkDateEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
