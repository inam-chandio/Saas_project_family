package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Gig;

@RestController
@RequestMapping("/gigs")
public class GigController {

    @PostMapping("/create")
    public String createGig(@RequestBody Gig gig) {
        return "Gig created successfully!";
    }
}
