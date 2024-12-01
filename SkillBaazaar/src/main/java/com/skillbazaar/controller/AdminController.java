package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.skillbazaar.model.User;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return List.of(new User(1L, "Admin User", "admin@example.com"));
    }
}
