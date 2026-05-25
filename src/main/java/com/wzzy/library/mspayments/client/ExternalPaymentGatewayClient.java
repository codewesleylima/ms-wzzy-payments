package com.wzzy.library.mspayments.client;

import com.wzzy.library.mspayments.dto.PaymentDTO;
import com.wzzy.library.mspayments.dto.TransactionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-gateway-client", url = "${payment.gateway.url}")
public interface ExternalPaymentGatewayClient {

    @PostMapping("/pix/process")
    TransactionDTO processPixPayment(@RequestBody PaymentDTO paymentDTO);

    @PostMapping("/card/authorize")
    TransactionDTO authorizeCardPayment(@RequestBody PaymentDTO paymentDTO);

    @PostMapping("/card/capture")
    TransactionDTO captureCardPayment(@RequestBody TransactionDTO transactionDTO);

    @PostMapping("/fraud-check")
    TransactionDTO performFraudCheck(@RequestBody PaymentDTO paymentDTO);

    @PostMapping("/refund")
    TransactionDTO refund(@RequestBody TransactionDTO transactionDTO);
}
