package com.constructorandinstancevariables;

public class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to access employeeID and department
    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}
