package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import com.skillbazaar.model.Proposal;

@RestController
@RequestMapping("/proposals")
public class ProposalController {

    @PostMapping("/submit")
    public String submitProposal(@RequestBody Proposal proposal) {
        return "Proposal submitted successfully!";
    }
}
