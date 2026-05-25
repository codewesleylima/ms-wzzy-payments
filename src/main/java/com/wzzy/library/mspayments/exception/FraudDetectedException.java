package com.wzzy.library.mspayments.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class FraudDetectedException extends ValidationException {
    public FraudDetectedException(double riskScore) {
        super("Payment rejected due to fraud detection. Risk score: " + riskScore, "FRAUD_DETECTED");
    }

    public FraudDetectedException(String message) {
        super(message, "FRAUD_DETECTED");
    }
}
