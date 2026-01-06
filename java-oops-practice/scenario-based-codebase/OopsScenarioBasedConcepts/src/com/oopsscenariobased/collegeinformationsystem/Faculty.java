package com.oopsscenariobased.collegeinformationsystem;

public class Faculty extends Person {

	//attribute
    private String department;

    //constructor
    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    //overriding method of parent class
    @Override
    public void printDetails() {
        System.out.println("Faculty ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }
}
