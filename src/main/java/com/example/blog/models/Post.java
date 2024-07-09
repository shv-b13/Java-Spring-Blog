package com.example.blog.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String anons, title;
    @Lob
    private String fullText;
    private int views;

    public Post(String anons, String title, String fullText) {
        this.anons = anons;
        this.title = title;
        this.fullText = fullText;
    }
    public Post() {
    }
}
