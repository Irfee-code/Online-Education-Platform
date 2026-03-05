package model;

import java.util.List;

public class RecordedCourse extends Course {

    private List<String> videoUrls;
    private int totalDuration;
    private int numberOfModules;

    public RecordedCourse(int id,
                          String title,
                          String description,
                          Instructor instructor,
                          double price,
                          boolean isPublished,
                          List<String> videoUrls,
                          int totalDuration,
                          int numberOfModules) {

        super(id, title, description, instructor, price,isPublished);

        this.videoUrls = videoUrls;
        this.totalDuration = totalDuration;
        this.numberOfModules = numberOfModules;
    }

    @Override
    public void startCourse() {
        System.out.println("Recorded course available to watch anytime.");
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated after completing recorded course.");
    }

}