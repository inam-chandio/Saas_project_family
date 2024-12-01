package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;

import com.skillbazaar.model.Job;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @PostMapping("/create")
    public String createJob(@RequestBody Job job) {
        return "Job created successfully!";
    }

    @GetMapping("/{id}")
    public Job getJob(@PathVariable Long id) {
        return new Job(id, "Sample Job", "Description of job");
    }
}
