package model;

import java.time.LocalDateTime;

public class Enrollment {

    private Student student;
    private Course course;
    private LocalDateTime enrolledAt;
    private boolean completed;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.enrolledAt = LocalDateTime.now();
        this.completed = false;
    }

    public void completeCourse() {
        this.completed = true;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getEnrolledAt() {
        return enrolledAt;
    }

    public boolean isCompleted() {
        return completed;
    }
}