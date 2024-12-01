package com.skillbazaar.service;

import com.skillbazaar.model.Analytics;
import com.skillbazaar.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    public Analytics getAnalyticsByUserId(Long userId) {
        return analyticsRepository.findByUserId(userId);
    }

    public Analytics saveAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }
}
