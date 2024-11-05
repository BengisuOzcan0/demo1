package com.example.demo;

public class Greeting {
    private Long id;
    private String content;

    public Greeting(long l, String format) {
        this.id = l;
        this.content = format; // Burada 'content' yerine 'format' kullanılmalı
    }

    public Long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
