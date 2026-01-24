package com.collections.streams.datastreams;

import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // writing primitive data
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            int stuRoll = 101;
            String stuName = "Rahul";
            double stuGPA = 8.75;

            dos.writeInt(stuRoll);
            dos.writeUTF(stuName);
            dos.writeDouble(stuGPA);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
            e.printStackTrace();
        }

        // reading primitive data
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
            e.printStackTrace();
        }
    }
}

