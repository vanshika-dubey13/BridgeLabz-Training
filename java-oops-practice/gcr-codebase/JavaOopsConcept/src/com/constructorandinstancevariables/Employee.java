package com.constructorandinstancevariables;

public class Employee {
    //creating attributes
    public int employeeID;

    // protected
    protected String department;

    // private
    private double salary;

    // parametrized Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Public method to view salary
    public double getSalary() {
        return salary;
    }
}
