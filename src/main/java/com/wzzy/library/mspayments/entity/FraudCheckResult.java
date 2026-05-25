package com.wzzy.library.mspayments.entity;

import com.wzzy.library.mspayments.enums.FraudLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_check_results")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckResult {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FraudLevel fraudLevel;

    private Double riskScore;
    private String riskAnalysis;
    private boolean approved;

    @Column(columnDefinition = "LONGTEXT")
    private String checkDetails;

    @Column(name = "checked_at")
    @Builder.Default
    private LocalDateTime checkedAt = LocalDateTime.now();
}
