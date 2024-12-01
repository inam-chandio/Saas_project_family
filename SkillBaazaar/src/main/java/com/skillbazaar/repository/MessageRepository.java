package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Message;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    // Custom query method to find messages between two users
    List<Message> findBySenderIdAndReceiverId(Long senderId, Long receiverId);
    
    // Custom query method to find all messages for a user
    List<Message> findByReceiverId(Long receiverId);
}
