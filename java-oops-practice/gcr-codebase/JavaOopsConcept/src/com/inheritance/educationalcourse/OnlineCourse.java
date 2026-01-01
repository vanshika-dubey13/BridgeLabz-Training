package com.inheritance.educationalcourse;

//subclass
class OnlineCourse extends Course {
	
	//attributes
    String platform;
    boolean isRecorded;

    //constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
