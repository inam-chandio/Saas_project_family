package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    // Custom query method to find admin by name
    Admin findByName(String name);
}
