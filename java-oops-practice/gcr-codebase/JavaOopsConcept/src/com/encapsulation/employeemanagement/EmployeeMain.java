package com.encapsulation.employeemanagement;

import java.util.ArrayList;
import java.util.List;

//Main class
public class EmployeeMain {
 public static void main(String[] args) {

     // Creating employees
     Employee e1 = new FullTimeEmployee(1, "Alice", 50000, 5000);
     Employee e2 = new PartTimeEmployee(2, "Bob", 80, 200);

     // Creating department
     Department hrDept = new HRDepartment();
     hrDept.assignDepartment("Human Resources");

     // List of employees for polymorphism
     List<Employee> employees = new ArrayList<>();
     employees.add(e1);
     employees.add(e2);

     // Displaying details and salary for each employee
     for (Employee e : employees) {
         e.displayDetails();
         System.out.println("Salary: " + e.calculateSalary());
         System.out.println(hrDept.getDepartmentDetails());
         System.out.println("----------------------------");
     }
 }}