package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

//Professor class
class Professor {
 private String name;
 private int id;
 List<Course> courses; // Association: Professor teaches many Courses

 public Professor(String name, int id) {
     this.name = name;
     this.id = id;
     this.courses = new ArrayList<>();
 }

 // Assign professor to a course
 public void assignCourse(Course c1) {
     if (!courses.contains(c1)) {
         courses.add(c1);
         c1.setProfessor(this); // Maintain bi-directional association
     }
 }

 public void showCourses() {
     System.out.println("Professor " + name + " teaches:");
     for (Course c : courses) {
         System.out.println(" - " + c.getCourseName());
     }
 }

 public void assignCourse(CollegeCourses c2) {
	// TODO Auto-generated method stub
	
 }
}
