package com.collectors;
import java.util.*;
import java.util.stream.Collectors;

//Student class to hold student's data
class Student {
	//attributes
    String name;
    String grade;

    //constructor
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    //method to get name
    public String getName() {
        return name;
    }

    //method to get grade
    public String getGrade() {
        return grade;
    }
}

//main class
public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "B"),
            new Student("Eve", "C")
        );

        Map<String, List<String>> result =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        System.out.println(result);
    }
}

