package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Event;

@RestController
@RequestMapping("/events")
public class EventController {

    @GetMapping("/upcoming")
    public Event getUpcomingEvents() {
        return new Event(1L, "Sample Event", "2024-11-01");
    }
}
