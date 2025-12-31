package com.inheritance.office;


public class OfficeMain {
    public static void main(String[] args) {

    	//creating objects for all subclasses
        Employee manager = new Manager("Alice", 101, 80000, 5);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000, 6);

        //displaying details 
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
