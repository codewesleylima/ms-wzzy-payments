package com.wzzy.library.mspayments.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class PaymentProcessingException extends BaseServiceException {
    public PaymentProcessingException(String message) {
        super(message, "PAYMENT_PROCESSING_ERROR", 400);
    }

    public PaymentProcessingException(String message, String code) {
        super(message, code, 400);
    }
}
