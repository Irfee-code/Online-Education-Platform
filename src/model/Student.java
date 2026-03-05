package model;

import java.util.*;

public class Student extends User {

    private List<Enrollment> enrollments;

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
        this.enrollments = new ArrayList<>();
    }

}