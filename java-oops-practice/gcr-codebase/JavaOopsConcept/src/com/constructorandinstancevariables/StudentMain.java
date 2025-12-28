package com.constructorandinstancevariables;

public class StudentMain {
    public static void main(String[] args) {

        PostgraduateStudent pgStudent =
                new PostgraduateStudent(101, "Aditya", 8.5);

        // Access public & protected members
        pgStudent.displayStudentInfo();

        // Access and modify private member via public methods
        System.out.println("CGPA: " + pgStudent.getCGPA());
        pgStudent.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
