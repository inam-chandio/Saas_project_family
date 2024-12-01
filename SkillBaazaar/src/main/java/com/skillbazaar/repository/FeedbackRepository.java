package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Feedback;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    // Custom query method to find feedback by userId
    List<Feedback> findByUserId(Long userId);
}
