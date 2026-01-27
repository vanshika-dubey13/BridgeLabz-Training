package com.iostream.csv;

//CSVReader.java
import java.io.*;
import java.util.*;

public class CSVReader {

 public static List<Student> readStudents(String filename) {
     List<Student> students = new ArrayList<>();

     try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
         String line;
         int lineNum = 0;
         while ((line = br.readLine()) != null) {
             lineNum++;
             line = line.trim();
             if (line.isEmpty()) continue; // skip empty lines

             // Split CSV line by comma
             String[] parts = line.split(",");

             // Validate CSV format
             if (parts.length != 4) {
                 System.out.println("Invalid format at line " + lineNum + ": " + line);
                 continue;
             }

             try {
                 int id = Integer.parseInt(parts[0].trim());
                 String name = parts[1].trim();
                 int age = Integer.parseInt(parts[2].trim());
                 double marks = Double.parseDouble(parts[3].trim());

                 Student student = new Student(id, name, age, marks);
                 students.add(student);
             } catch (NumberFormatException e) {
                 System.out.println("Number format error at line " + lineNum + ": " + line);
             }
         }
     } catch (IOException e) {
         e.printStackTrace();
     }

     return students;
 }
}

