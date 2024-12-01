package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Message;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @PostMapping("/send")
    public String sendMessage(@RequestBody Message message) {
        return "Message sent successfully!";
    }
}
