package com.collections.streams.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    //attributes
    int empId;
    String empName;
    String empDepartment;
    double empSalary;

    //constructor
    public Employee(int empId, String empName, String empDepartment, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    //overriding method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Department: " + empDepartment +
               ", Salary: " + empSalary;
    }
}

