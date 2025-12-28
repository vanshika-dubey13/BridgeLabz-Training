package com.constructorandinstancevariables;

public class EmployeeMain {
	public static void main(String[] args) {
        Manager mgr = new Manager(101, "IT", 50000);

        // Access public and protected members via Manager method
        mgr.displayManagerInfo();

        // Modify salary using public method
        mgr.setSalary(60000);

        // Display updated salary
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
