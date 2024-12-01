package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Notification;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable Long id) {
        return new Notification(id, "New Notification", "Notification message here");
    }
}
