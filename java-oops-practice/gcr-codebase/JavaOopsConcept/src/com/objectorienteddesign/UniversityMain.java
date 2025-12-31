package com.objectorienteddesign;

public class UniversityMain {
    public static void main(String[] args) {

    	//creating multiple faculties objects
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        University uni = new University("Tech University");

        uni.addDepartments("Computer Science");
        uni.addDepartments("Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Delete the university
        uni.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Faculty still exists: " + f1.getName());
    }
}
