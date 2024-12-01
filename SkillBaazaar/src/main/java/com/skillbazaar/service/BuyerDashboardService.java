package com.skillbazaar.service;

import com.skillbazaar.model.BuyerDashboard;
import com.skillbazaar.repository.BuyerDashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerDashboardService {

    @Autowired
    private BuyerDashboardRepository buyerDashboardRepository;

    public BuyerDashboard getBuyerDashboardByUserId(Long userId) {
        return buyerDashboardRepository.findByUserId(userId);
    }
}
