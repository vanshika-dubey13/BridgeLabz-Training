package com.constructorandinstancevariables;

class CourseMain {
    public static void main(String[] args) {

        // Create course objects
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Python Programming", 4, 12000);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name using class method
        Course.updateInstituteName("XYZ Technologies");

        // Display details again after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
