package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Feedback;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @PostMapping("/submit")
    public String submitFeedback(@RequestBody Feedback feedback) {
        return "Feedback submitted successfully!";
    }
}
