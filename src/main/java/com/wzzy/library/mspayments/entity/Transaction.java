package com.wzzy.library.mspayments.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionIdEntity;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment paymentEntity;

    @Column(nullable = false)
    private String statusEntity;

    @Column(length = 2000)
    private String gatewayResponseEntity;

    @Column(nullable = false)
    private LocalDateTime timestampEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();
}
