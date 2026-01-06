package com.oopsscenariobased.collegeinformationsystem;

import java.util.*;

public class Course {

	//attributes
    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    //constructor
    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    //adding student
    public void addStudent(Student student) {
        students.add(student);
    }

    //removing student
    public void removeStudent(Student student) {
        students.remove(student);
    }

    //displaying course details
    public void courseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + students.size());
    }
}
