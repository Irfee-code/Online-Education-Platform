package model;

abstract public class Course {
    private int id;
    private String title;
    private String description;

    private Instructor instructor;
    private double price;
    private boolean isPublished;

    public Course(int id,String title,String description,Instructor instructor,double price,boolean isPublished)
    {
        this.id=id;
        this.description=description;
        this.title=title;
        this.instructor=instructor;
        this.price=price;
        this.isPublished=isPublished;
    }

    public abstract void startCourse();
    public abstract void generateCertificate();

    public void publish() {
        this.isPublished = true;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public boolean isPublished() { return isPublished; }

    public Instructor getInstructor() {
        return instructor;
    }

}
