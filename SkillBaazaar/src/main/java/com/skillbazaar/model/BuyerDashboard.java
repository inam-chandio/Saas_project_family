package com.skillbazaar.model;

public class BuyerDashboard {
    private Long id;
    private Long userId;

    public BuyerDashboard(Long id, Long userId) {
        this.id = id;
        this.userId = userId;
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
}
