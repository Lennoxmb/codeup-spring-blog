package com.codeup.codeupspringblog.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Post {
    private String title;
    private String body;
    @Id
    private Long id;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post() {
    }

    public Post(String title, String body, Long id) {
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
