package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Review;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // Custom query method to find reviews by userId
    List<Review> findByUserId(Long userId);
    
    // Custom query method to find reviews by jobId
    List<Review> findByJobId(Long jobId);
}
