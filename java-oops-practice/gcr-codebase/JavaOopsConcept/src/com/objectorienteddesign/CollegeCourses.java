package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

//Course class
public class CollegeCourses {
	private String courseName;
	private Professor professor; // Association: Course has a Professor
	private List<CollegeStudent> students; // Association: Course has many Students

	public CollegeCourses(String courseName) {
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
		if (!professor.courses.contains(this)) {
			professor.assignCourse(this); // Ensure bidirectional consistency
		}
	}

	public void addStudent(CollegeStudent student) {
		if (!students.contains(student)) {
			students.add(student);
			if (!student.getCourses().contains(this)) {
				student.enrollCourse(this); // Ensure bidirectional consistency
			}
		}
	}

	public void showStudents() {
		System.out.println("Students in " + courseName + ":");
		for (CollegeStudent s : students) {
			System.out.println(" - " + s.name);
		}
	}
}
