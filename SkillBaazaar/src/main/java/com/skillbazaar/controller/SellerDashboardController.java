package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller/dashboard")
public class SellerDashboardController {

    @GetMapping("/stats")
    public String getSellerStats() {
        return "Seller dashboard stats here.";
    }
}
