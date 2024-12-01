package com.skillbazaar.model;

public class Feedback {
    private Long id;
    private Long userId;
    private String comments;

    public Feedback(Long id, Long userId, String comments) {
        this.id = id;
        this.userId = userId;
        this.comments = comments;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
