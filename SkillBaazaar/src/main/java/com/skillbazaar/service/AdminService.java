package com.skillbazaar.service;

import com.skillbazaar.model.Admin;
import com.skillbazaar.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminByName(String name) {
        return adminRepository.findByName(name);
    }
}
