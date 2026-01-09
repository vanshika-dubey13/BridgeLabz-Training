package com.oopsscenariobased.onlinelearningplatform;
import java.util.*;

public class Course {
	
	//attributes
    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    // read-only
    private String review = "Internal Review Only"; 

    // Default constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Summary"};
        this.rating = new Random().nextInt(5) + 1;
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = new Random().nextInt(5) + 1;
    }

    public String getTitle() {
        return title;
    }

    public int getModuleCount() {
        return modules.length;
    }

    // protected rating logic
    protected void updateRating(int stars) {
        if (stars >= 1 && stars <= 5)
            rating = (rating + stars) / 2;
    }

    // Read-only access
    public String getReview() {
        return review;
    }

    //displaying course details
    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Rating: " + rating);
        System.out.println("Modules: " + Arrays.toString(modules));
    }
}
