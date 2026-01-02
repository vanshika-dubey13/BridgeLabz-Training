package com.dsa.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentOperations stu = new StudentOperations();
        Scanner sc = new Scanner(System.in);
        int choice;

        //displaying operations that can be performed
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Display All Students");
            System.out.println("7. Update Student Grade");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade (A-F): ");
                    char grade = sc.next().charAt(0);
                    StudentNode newStudent = new StudentNode(roll, name, age, grade);

                    if (choice == 1) stu.addAtBeginning(newStudent);
                    else if (choice == 2) stu.addAtEnd(newStudent);
                    else {
                        System.out.print("Enter position: ");
                        int pos = sc.nextInt();
                        stu.addAtPosition(newStudent, pos);
                    }
                }
                case 4 -> {
                    System.out.print("Enter Roll Number to delete: ");
                    int roll = sc.nextInt();
                    stu.deleteByRollNumber(roll);
                }
                case 5 -> {
                    System.out.print("Enter Roll Number to search: ");
                    int roll = sc.nextInt();
                    stu.searchByRollNumber(roll);
                }
                case 6 -> stu.displayAll();
                case 7 -> {
                    System.out.print("Enter Roll Number to update grade: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter new Grade (A-F): ");
                    char grade = sc.next().charAt(0);
                    stu.updateGrade(roll, grade);
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
