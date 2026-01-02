package com.oopsscenariobased.universitycourseenrollmentsystem;

class Enrollment implements Graded {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;
        System.out.println("Grade " + grade + " assigned for " + course.getCourseName());
    }

    // Pass/Fail grading 
    public void assignGrade(boolean pass) {
        this.grade = pass ? "Pass" : "Fail";
    }

    public int getGradePoints() {
        switch (grade) {
            case "A": return 10;
            case "B": return 8;
            case "C": return 6;
            default: return 0;
        }
    }

    public int getCredits() {
        return course.getCredits();
    }
}