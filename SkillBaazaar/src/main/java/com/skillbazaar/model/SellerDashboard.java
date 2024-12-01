package com.skillbazaar.model;

public class SellerDashboard {
    private Long id;
    private Long userId;
    private double earnings;

    public SellerDashboard(Long id, Long userId, double earnings) {
        this.id = id;
        this.userId = userId;
        this.earnings = earnings;
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

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
