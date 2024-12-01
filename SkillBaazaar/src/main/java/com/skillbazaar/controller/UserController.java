package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return new User(id, "Sample User", "user@example.com");
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        return "User updated successfully!";
    }
}
