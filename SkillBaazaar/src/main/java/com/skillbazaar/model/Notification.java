package com.skillbazaar.model;

public class Notification {
    private Long id;
    private Long userId;
    private String message;

    public Notification(Long id, Long userId, String message) {
        this.id = id;
        this.userId = userId;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
