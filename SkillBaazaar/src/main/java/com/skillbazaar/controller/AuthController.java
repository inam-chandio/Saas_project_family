package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return "User logged in successfully!";
    }
}
