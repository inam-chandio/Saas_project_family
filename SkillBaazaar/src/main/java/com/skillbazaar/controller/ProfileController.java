package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.User;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/{id}")
    public User getProfile(@PathVariable Long id) {
        return new User(id, "Sample User", "user@example.com");
    }
}
