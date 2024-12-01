package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Gig;
import java.util.List;

public interface GigRepository extends JpaRepository<Gig, Long> {

    // Custom query method to find gigs by userId
    List<Gig> findByUserId(Long userId);
    
    // Custom query method to find gigs by title containing keyword
    List<Gig> findByTitleContaining(String keyword);
}
