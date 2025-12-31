package com.objectorienteddesign;

public class SchoolMain {
    public static void main(String[] args) {

        // Creating School
        School school = new School("Greenwood High");

        // Creating Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Creating Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Aggregation: School has Students
        school.addStudent(alice);
        school.addStudent(bob);

        // Association: Students enroll in Courses
        alice.enrollCourse(math);
        alice.enrollCourse(science);
        bob.enrollCourse(math);

        // Displaying info
        school.showStudents();
        System.out.println();

        alice.showCourses();
        bob.showCourses();
        System.out.println();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
