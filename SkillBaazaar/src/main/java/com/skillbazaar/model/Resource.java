package com.skillbazaar.model;

public class Resource {
    private Long id;
    private String title;
    private String url;

    public Resource(Long id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
