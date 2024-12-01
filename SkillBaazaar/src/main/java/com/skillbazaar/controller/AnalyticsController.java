package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    @GetMapping("/stats")
    public String getPlatformStats() {
        return "Analytics stats here.";
    }
}
