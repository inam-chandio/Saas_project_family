package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.BuyerDashboard;

public interface BuyerDashboardRepository extends JpaRepository<BuyerDashboard, Long> {

    // Custom query method to find dashboard by userId
    BuyerDashboard findByUserId(Long userId);
}
