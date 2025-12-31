package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

class Student {
	
	//attributes
    private String name;
    private List<Course> courses;

    //setting student name and course
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //displaying students name
    public String getName() {
        return name;
    }
    
    //enrolling student in course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // maintain bidirectional association
        }
    }

    //displaying courses
    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
