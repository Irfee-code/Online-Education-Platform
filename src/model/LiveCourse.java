package model;

import java.time.LocalDateTime;

public class LiveCourse extends Course {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int maxSeats;
    private String meetingLink;

    public LiveCourse(int id,
                      String title,
                      String description,
                      Instructor instructor,
                      double price,
                      boolean isPublished,
                      LocalDateTime startTime,
                      LocalDateTime endTime,
                      int maxSeats,
                      String meetingLink) {

        super(id, title, description, instructor, price, isPublished);

        this.startTime = startTime;
        this.endTime = endTime;
        this.maxSeats = maxSeats;
        this.meetingLink = meetingLink;
    }

    @Override
    public void startCourse() {
        System.out.println("Live course started at: " + startTime);
        System.out.println("Join using link: " + meetingLink);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for live course: " + getTitle());
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public String getMeetingLink() {
        return meetingLink;
    }
}