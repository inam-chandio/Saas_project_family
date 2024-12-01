package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Subscription;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @PostMapping("/subscribe")
    public String subscribe(@RequestBody Subscription subscription) {
        return "Subscription successful!";
    }
}
