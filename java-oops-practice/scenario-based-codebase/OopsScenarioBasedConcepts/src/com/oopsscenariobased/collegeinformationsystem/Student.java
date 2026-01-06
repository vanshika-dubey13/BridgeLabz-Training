package com.oopsscenariobased.collegeinformationsystem;

import java.util.*;

public class Student extends Person implements ICourseActions {
	
	//enrolled courses
    private List<Course> courses;     
    private List<Integer> grades;

    //constructor
    public Student(int id, String name, String email) {
        super(id, name, email);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        for (int g : grades) {
            sum += g; 
        }
        return (double) sum / grades.size();
    }

    //overriding method of parent class
    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

  //overriding method of parent class
    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

  //overriding method of parent class
    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
