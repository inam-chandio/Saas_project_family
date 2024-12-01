package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method to find user by email
    Optional<User> findByEmail(String email);
    
    // Custom query method to check if email exists
    boolean existsByEmail(String email);
}
