package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Transaction;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @PostMapping("/process")
    public String processTransaction(@RequestBody Transaction transaction) {
        return "Transaction processed successfully!";
    }
}
