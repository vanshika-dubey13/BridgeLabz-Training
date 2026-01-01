package com.inheritance.educationalcourse;

//superclass
class Course {
	
	//attributes
    String courseName;
    int duration; // duration in hours

    //constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
