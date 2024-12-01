package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Notification;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    // Custom query method to find notifications by userId
    List<Notification> findByUserId(Long userId);
    
    // Custom query method to find unread notifications
    List<Notification> findByUserIdAndIsReadFalse(Long userId);
}
