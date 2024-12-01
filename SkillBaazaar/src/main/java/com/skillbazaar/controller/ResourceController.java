package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Resource;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @GetMapping("/all")
    public Resource getResources() {
        return new Resource(1L, "Sample Resource", "http://resource-url.com");
    }
}
