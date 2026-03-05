package model;

import java.util.*;

public class Instructor extends User {

    private String bio;
    private List<Course> courses;

    public Instructor(int id, String name, String email, String password, String bio) {
        super(id, name, email, password);
        this.bio = bio;
        this.courses = new ArrayList<>();
    }

}