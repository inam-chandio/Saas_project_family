package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Payment;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/make")
    public String makePayment(@RequestBody Payment payment) {
        return "Payment processed successfully!";
    }
}
