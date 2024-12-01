package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Review;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping("/add")
    public String addReview(@RequestBody Review review) {
        return "Review added successfully!";
    }
}
