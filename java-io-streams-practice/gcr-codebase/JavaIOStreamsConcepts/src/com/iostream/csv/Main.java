package com.iostream.csv;

//Main.java
import java.util.List;

public class Main {
 public static void main(String[] args) {
     String filename = "students.csv"; // CSV file path

     List<Student> students = CSVReader.readStudents("D:\\Java programming workspace\\java-io-streams-practice\\gcr-codebase\\JavaIOStreamsConcepts\\src\\com\\iostream\\csv\\students.csv");

     System.out.println("Student Records:");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}

