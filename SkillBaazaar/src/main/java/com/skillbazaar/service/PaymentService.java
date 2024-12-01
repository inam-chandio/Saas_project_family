package com.skillbazaar.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String paymentDetails) {
        // Business logic for payment processing
        return "Payment processed successfully!";
    }
}
