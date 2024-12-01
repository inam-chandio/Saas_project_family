package com.skillbazaar.model;

public class Job {
    private Long id;
    private String title;
    private String description;
    private double budget;

    public Job(Long id, String title, String description, double budget) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
