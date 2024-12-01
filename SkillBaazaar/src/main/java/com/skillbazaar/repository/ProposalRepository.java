package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Proposal;
import java.util.List;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {

    // Custom query method to find proposals by jobId
    List<Proposal> findByJobId(Long jobId);
    
    // Custom query method to find proposals by freelancerId
    List<Proposal> findByFreelancerId(Long freelancerId);
}
