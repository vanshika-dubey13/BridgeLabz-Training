package com.scenariobased.optionalclass;

import java.util.Optional;

class Student {
	//attributes
    int id;
    String name;
    String nickname;
    String email;
    String phone;
    String address;

    //constructor
    Student(int id, String name, String nickname,
            String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}

//main class
public class StudentManagementSystem {
	//main method
    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Rahul",
                // nickname missing
                null,          
                // email missing
                null,          
                // phone missing
                null,          
                "Bangalore"
        );

        //  Fetch email safely
        Optional.ofNullable(student.email)
                .ifPresentOrElse(
                        e -> System.out.println("Email: " + e),
                        () -> System.out.println("Email not available")
                );

        //  Default phone number if missing
        String phone = Optional.ofNullable(student.phone)
                .orElse("9999999999");
        System.out.println("Phone: " + phone);

        //  Find student by ID
        Optional<Student> studentOpt = findStudentById(101);
        System.out.println(
                studentOpt
                        .map(s -> "Student Found: " + s.name)
                        .orElse("Student not available")
        );

        //  Fetch address safely
        String address = Optional.ofNullable(student.address)
                .orElse("Address not provided");
        System.out.println("Address: " + address);

        //  Nickname if present, else real name
        String displayName = Optional.ofNullable(student.nickname)
                .orElse(student.name);
        System.out.println("Display Name: " + displayName);
    }

    static Optional<Student> findStudentById(int id) {
        return Optional.empty(); // simulate not found
    }
}

