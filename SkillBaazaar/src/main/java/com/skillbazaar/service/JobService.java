package com.skillbazaar.service;

import com.skillbazaar.model.Job;
import com.skillbazaar.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public List<Job> searchJobsByTitle(String title) {
        return jobRepository.findByTitleContaining(title);
    }

    public List<Job> getJobsByBudgetRange(double minBudget, double maxBudget) {
        return jobRepository.findByBudgetBetween(minBudget, maxBudget);
    }
}
