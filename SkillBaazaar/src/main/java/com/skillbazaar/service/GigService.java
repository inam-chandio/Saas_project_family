package com.skillbazaar.service;

import com.skillbazaar.model.Gig;
import com.skillbazaar.repository.GigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigService {

    @Autowired
    private GigRepository gigRepository;

    public Gig createGig(Gig gig) {
        return gigRepository.save(gig);
    }

    public List<Gig> getGigsByUserId(Long userId) {
        return gigRepository.findByUserId(userId);
    }

    public List<Gig> searchGigsByTitle(String keyword) {
        return gigRepository.findByTitleContaining(keyword);
    }
}
