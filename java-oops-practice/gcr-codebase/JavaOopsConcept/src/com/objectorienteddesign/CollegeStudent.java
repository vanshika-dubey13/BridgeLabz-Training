package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

// Student class
class CollegeStudent {
	
	//attributes
    String name;
    private int id;
    private List<CollegeCourses> courses; // Association: Student has many Courses

    public CollegeStudent(String name, int id) {
        this.name = name;
        this.id = id;
        this.setCourses(new ArrayList<>());
    }

    // Enroll student in a course
    public void enrollCourse(CollegeCourses course) {
        if (!getCourses().contains(course)) {
            getCourses().add(course);
            course.addStudent(this); // Maintain bi-directional association
        }
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (CollegeCourses c : getCourses()) {
            System.out.println(" - " + c.getCourseName());
        }
    }

	public List<CollegeCourses> getCourses() {
		return courses;
	}

	public void setCourses(List<CollegeCourses> courses) {
		this.courses = courses;
	}
}




