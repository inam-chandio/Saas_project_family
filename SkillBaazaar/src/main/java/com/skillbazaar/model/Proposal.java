package com.skillbazaar.model;

public class Proposal {
    private Long id;
    private Long jobId;
    private Long freelancerId;
    private String message;
    private double proposedRate;

    public Proposal(Long id, Long jobId, Long freelancerId, String message, double proposedRate) {
        this.id = id;
        this.jobId = jobId;
        this.freelancerId = freelancerId;
        this.message = message;
        this.proposedRate = proposedRate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getFreelancerId() {
        return freelancerId;
    }

    public void setFreelancerId(Long freelancerId) {
        this.freelancerId = freelancerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getProposedRate() {
        return proposedRate;
    }

    public void setProposedRate(double proposedRate) {
        this.proposedRate = proposedRate;
    }
}
