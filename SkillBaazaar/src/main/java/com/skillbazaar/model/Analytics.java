package com.skillbazaar.model;

public class Analytics {
    private Long id;
    private Long userId;
    private int totalJobsCompleted;

    public Analytics(Long id, Long userId, int totalJobsCompleted) {
        this.id = id;
        this.userId = userId;
        this.totalJobsCompleted = totalJobsCompleted;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getTotalJobsCompleted() {
        return totalJobsCompleted;
    }

    public void setTotalJobsCompleted(int totalJobsCompleted) {
        this.totalJobsCompleted = totalJobsCompleted;
    }
}
