package com.wzzy.library.mspayments.exception;

import com.wzzy.library.bfflibrary.exception.ServiceUnavailableException;

public class PaymentGatewayException extends ServiceUnavailableException {
    public PaymentGatewayException(String gatewayName) {
        super("Payment gateway '" + gatewayName + "' is unavailable");
    }

    public PaymentGatewayException(String message, String code) {
        super(message, code);
    }
}
