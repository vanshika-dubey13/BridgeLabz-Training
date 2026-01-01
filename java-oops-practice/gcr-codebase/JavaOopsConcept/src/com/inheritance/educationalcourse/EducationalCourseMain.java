package com.inheritance.educationalcourse;

//main class
public class EducationalCourseMain {
    public static void main(String[] args) {
    	
    	//creating objects
        PaidOnlineCourse course = new PaidOnlineCourse(
            "Java Programming",
            40,
            "Udemy",
            true,
            5000,
            20
        );

        //displaying results
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " hours");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Final Fee: Rs. " + course.calculateFinalFee());
    }
}
