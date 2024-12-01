package com.skillbazaar.service;

import com.skillbazaar.model.Proposal;
import com.skillbazaar.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProposalService {

    @Autowired
    private ProposalRepository proposalRepository;

    public Proposal submitProposal(Proposal proposal) {
        return proposalRepository.save(proposal);
    }

    public List<Proposal> getProposalsByJobId(Long jobId) {
        return proposalRepository.findByJobId(jobId);
    }

    public List<Proposal> getProposalsByFreelancerId(Long freelancerId) {
        return proposalRepository.findByFreelancerId(freelancerId);
    }
}
