package com.project.practice;

import java.util.UUID;

public class Grade {
    private String name;
    private String score;
    private String subject;
    private String id;

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public Grade(String name, String score, String subject) {
        this.name = name;
        this.score = score;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
