package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.UserSettings;

@RestController
@RequestMapping("/settings")
public class SettingsController {

    @PostMapping("/update")
    public String updateSettings(@RequestBody UserSettings settings) {
        return "Settings updated successfully!";
    }
}
