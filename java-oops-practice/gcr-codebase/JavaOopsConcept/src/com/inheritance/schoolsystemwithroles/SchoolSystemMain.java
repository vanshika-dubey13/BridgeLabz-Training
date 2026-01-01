package com.inheritance.schoolsystemwithroles;

//main method
public class SchoolSystemMain {
    public static void main(String[] args) {
    	
    	//creating objects for subclasses
        Teacher teacher = new Teacher("Mr. Rao", 40, "Mathematics");
        Student student = new Student("Anita", 15, "10th Grade");
        Staff staff = new Staff("Mr. Kumar", 35, "Administration");

        //displaying details
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
