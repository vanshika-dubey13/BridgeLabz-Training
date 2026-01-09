package com.oopsscenariobased.onlinelearningplatform;

import java.util.Random;

public class Student extends User implements ICertifiable {
    
	//attributes
	private int completedModules;
    private int totalModules;
    private double grade;

    //constructor
    public Student(String name, int id) {
        super(name, id);
    }

    //method to enroll in course
    public void enrollCourse(Course c) {
        totalModules = c.getModuleCount();
        completedModules = new Random().nextInt(totalModules + 1);
        System.out.println(name + " enrolled in " + c.getTitle());
    }

    //method to track progress
    public void trackProgress() {
        double progress = (double) completedModules / totalModules * 100;
        System.out.println("Progress: " + progress + "%");
    }

    //method to calculate grades
    public void calculateGrade() {
        grade = (completedModules * 100.0) / totalModules;
        System.out.println("Grade: " + grade);
    }

    // Polymorphism
    @Override
    public void generateCertificate(String courseLevel) {
        System.out.println("\n--- CERTIFICATE ---");
        System.out.println("Student: " + name);
        if (courseLevel.equalsIgnoreCase("Beginner"))
            System.out.println("Certificate of Completion");
        else if (courseLevel.equalsIgnoreCase("Advanced"))
            System.out.println("Certificate of Excellence");
        else
            System.out.println("Certificate of Participation");
    }
}
