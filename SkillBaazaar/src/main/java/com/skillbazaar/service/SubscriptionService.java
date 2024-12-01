package com.skillbazaar.service;

import com.skillbazaar.model.Subscription;
import com.skillbazaar.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription subscribe(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> getSubscriptionsByPlanName(String planName) {
        return subscriptionRepository.findByPlanName(planName);
    }
}
