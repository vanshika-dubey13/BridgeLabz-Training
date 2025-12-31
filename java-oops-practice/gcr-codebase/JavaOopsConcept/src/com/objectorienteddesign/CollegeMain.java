package com.objectorienteddesign;

//Main class to test
public class CollegeMain {
 public static void main(String[] args) {
     // Create students
     CollegeStudent s1 = new CollegeStudent("Alice", 101);
     CollegeStudent s2 = new CollegeStudent("Bob", 102);

     // Create professors
     Professor p1 = new Professor("Dr. Smith", 201);
     Professor p2 = new Professor("Dr. Johnson", 202);

     // Create courses
     CollegeCourses c1 = new CollegeCourses("Mathematics");
     CollegeCourses c2 = new CollegeCourses("Physics");

     // Assign professors to courses
     p1.assignCourse(c1);
     p2.assignCourse(c2);

     // Enroll students in courses
     s1.enrollCourse(c1);
     s2.enrollCourse(c1);
     s2.enrollCourse(c2);

     // Display info
     s1.showCourses();
     s2.showCourses();
     p1.showCourses();
     p2.showCourses();
     c1.showStudents();
     c2.showStudents();
 }
}

