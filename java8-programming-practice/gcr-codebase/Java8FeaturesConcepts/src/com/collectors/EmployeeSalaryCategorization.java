package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

//class Employee to store employee details
class Employee {
	//attributes
    String name;
    String department;
    double salary;

    //constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //method to get department name
    public String getDepartmentName() {
        return department;
    }

    //method to get salary
    public double getSalary() {
        return salary;
    }
}

//main class
public class EmployeeSalaryCategorization {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 70000),
            new Employee("David", "HR", 55000),
            new Employee("Eve", "Finance", 65000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartmentName,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        System.out.println(avgSalaryByDept);
    }
}

