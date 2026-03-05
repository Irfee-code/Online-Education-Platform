package model;

import java.time.LocalDateTime;

public class Review {

    private Student student;
    private Course course;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;

    public Review(Student student, Course course, int rating, String comment) {
        this.student = student;
        this.course = course;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = LocalDateTime.now();
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}