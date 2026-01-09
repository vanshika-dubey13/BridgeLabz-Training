package com.oopsscenariobased.onlinelearningplatform;

class Instructor extends User {

	//constructor
    public Instructor(String name, int id) {
        super(name, id);
    }

    //method to upload course
    public void uploadCourse(Course c) {
        System.out.println("Instructor " + name + " uploaded course: " + c.getTitle());
    }
}
