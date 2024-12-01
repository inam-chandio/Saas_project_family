package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Transaction;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Custom query method to find transactions by userId
    List<Transaction> findByUserId(Long userId);
    
    // Custom query method to find transactions by status
    List<Transaction> findByStatus(String status);
}
