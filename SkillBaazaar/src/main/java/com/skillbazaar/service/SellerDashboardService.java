package com.skillbazaar.service;

import com.skillbazaar.model.SellerDashboard;
import com.skillbazaar.repository.SellerDashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerDashboardService {

    @Autowired
    private SellerDashboardRepository sellerDashboardRepository;

    public SellerDashboard getSellerDashboardByUserId(Long userId) {
        return sellerDashboardRepository.findByUserId(userId);
    }
}
