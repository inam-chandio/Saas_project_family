package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyer/dashboard")
public class BuyerDashboardController {

    @GetMapping("/stats")
    public String getBuyerStats() {
        return "Buyer dashboard stats here.";
    }
}
