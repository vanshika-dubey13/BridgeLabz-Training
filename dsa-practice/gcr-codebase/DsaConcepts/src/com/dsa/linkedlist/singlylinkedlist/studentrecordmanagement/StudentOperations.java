package com.dsa.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class StudentOperations {
	// head of the linked list
    StudentNode head; 

    // Method to add student at the beginning
    public void addAtBeginning(StudentNode newNode) {
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at the beginning.\n");
    }

    // Method to add student at the end
    public void addAtEnd(StudentNode newNode) {
        if (head == null) {
            head = newNode;
        }
        else {
            StudentNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Student added at the end.\n");
    }

    // Method to add student at a specific position (1-based index)
    public void addAtPosition(StudentNode newNode, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.\n");
            return;
        }

        if (position == 1) {
            addAtBeginning(newNode);
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position is out of bounds.\n");
        }
        else {
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Student added at position " + position + ".\n");
        }
    }

    // Method to delete student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.\n");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.\n");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.\n");
        }
    }

    // Method to search student by Roll Number
    public void searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll No: " + temp.rollNumber + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.\n");
    }

    // Method to display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Method to update student grade by Roll Number
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
}
