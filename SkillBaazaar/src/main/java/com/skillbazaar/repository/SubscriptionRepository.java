package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Subscription;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // Custom query method to find subscriptions by planName
    List<Subscription> findByPlanName(String planName);
}
