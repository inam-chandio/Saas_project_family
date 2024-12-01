package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/help")
public class HelpController {

    @GetMapping("/faq")
    public String getFaq() {
        return "Frequently Asked Questions";
    }
}
