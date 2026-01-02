package com.dsa.linkedlist.singlylinkedlist.studentrecordmanagement;

//creating class student to store attributes and create linkedlist
public class StudentNode {
	
	//attributes
    int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;

    // Constructor
    public StudentNode(int rollNumber, String name, int age, char grade) {
    	
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null; // next initially points to null
        
    }
}
