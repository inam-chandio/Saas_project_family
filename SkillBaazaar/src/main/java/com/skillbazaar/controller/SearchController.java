package com.skillbazaar.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.skillbazaar.model.Freelancer;

@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping("/freelancers")
    public List<Freelancer> searchFreelancers(@RequestParam String skill) {
        return List.of(new Freelancer(1L, "Freelancer 1", skill));
    }
}
