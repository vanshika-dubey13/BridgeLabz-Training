package com.scenariobased.markmate;

import java.io.*;
import java.util.*;
import com.google.gson.Gson;

public class MarkMateMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("marks.csv"))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                try {
                    int rollNo = Integer.parseInt(data[0]);
                    String name = data[1];

                    int maths = Integer.parseInt(data[2]);
                    int science = Integer.parseInt(data[3]);
                    int english = Integer.parseInt(data[4]);

                    int total = maths + science + english;
                    double avg = total / 3.0;
                    String grade = GradeUtil.calculateGrade(avg);

                    students.add(new Student(rollNo, name, total, avg, grade));

                } catch (NumberFormatException e) {
                    System.out.println("⚠ Invalid marks for student: " + data[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        exportToJson(students);
    }

    // JSON Export
    public static void exportToJson(List<Student> students) {
        try (FileWriter writer = new FileWriter("reportCard.json")) {
            Gson gson = new Gson();
            gson.toJson(students, writer);
            System.out.println("✅ JSON Report Card Generated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

