package com.skillbazaar.model;

public class Event {
    private Long id;
    private String title;
    private String date;

    public Event(Long id, String title, String date) {
        this.id = id;
        this.title = title;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
