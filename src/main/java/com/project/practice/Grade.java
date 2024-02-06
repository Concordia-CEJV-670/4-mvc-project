package com.project.practice;

public class Grade {
    private String name;
    private String score;
    private String subject;

    public Grade() {
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

}
