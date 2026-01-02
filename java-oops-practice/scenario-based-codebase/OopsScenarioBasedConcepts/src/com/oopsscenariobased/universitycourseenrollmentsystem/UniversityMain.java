package com.oopsscenariobased.universitycourseenrollmentsystem;

public class UniversityMain {
    public static void main(String[] args) {

    	//creating objects of student, courses and enrollments
        Student s1 = new Undergraduate(101, "Alice");
        Course c1 = new Course("CS101", "Java Programming", 4);

        Enrollment e1 = new Enrollment(s1, c1);

        Faculty f1 = new Faculty();
        f1.gradeStudent(e1, "A");

        //displaying results
        double totalPoints = e1.getGradePoints() * e1.getCredits();
        s1.calculateGPA(totalPoints, e1.getCredits());

        System.out.println("Student GPA: " + s1.getTranscript());
    }
}
