package com.oopsscenariobased.collegeinformationsystem;

public class CollegeInfoMain {

    public static void main(String[] args) {

    	//creating object for faculty, students & course
        Faculty faculty = new Faculty(101, "Dr. Sharma", "sharma@uni.edu", "Computer Science");

        Student s1 = new Student(1, "Amit", "amit@uni.edu");
        Student s2 = new Student(2, "Neha", "neha@uni.edu");

        Course java = new Course("Java Programming", faculty);

        s1.enrollCourse(java);
        s2.enrollCourse(java);

        s1.addGrade(8);
        s1.addGrade(9);
        s2.addGrade(7);
        s2.addGrade(8);

        //displaying results
        s1.printDetails();
        System.out.println();
        faculty.printDetails();
        System.out.println();

        java.courseDetails();
    }
}
