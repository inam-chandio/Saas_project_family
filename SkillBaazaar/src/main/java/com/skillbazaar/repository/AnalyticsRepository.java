package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Analytics;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {

    // Custom query method to find analytics by userId
    Analytics findByUserId(Long userId);
}
