package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Job;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    // Custom query method to find jobs by title
    List<Job> findByTitleContaining(String title);
    
    // Custom query method to find jobs by budget range
    List<Job> findByBudgetBetween(double minBudget, double maxBudget);
}
