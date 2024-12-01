package com.skillbazaar.model;

public class Subscription {
    private Long id;
    private String planName;
    private double price;

    public Subscription(Long id, String planName, double price) {
        this.id = id;
        this.planName = planName;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
