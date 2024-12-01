package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.SellerDashboard;

public interface SellerDashboardRepository extends JpaRepository<SellerDashboard, Long> {

    // Custom query method to find dashboard by userId
    SellerDashboard findByUserId(Long userId);
}
