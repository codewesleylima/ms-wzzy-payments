package com.wzzy.library.mspayments.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_methods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentMethodIdEntity;

    @Column(nullable = false)
    private Long customerIdEntity;

    @Column(nullable = false)
    private String cardLastFourDigitsEntity;

    @Column(nullable = false)
    private String cardTypeEntity;

    @Column(nullable = false)
    private Integer expiryMonthEntity;

    @Column(nullable = false)
    private Integer expiryYearEntity;

    @Column(nullable = false)
    private Boolean isDefaultEntity = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
