package com.collections.map;

import java.util.*;

import java.util.*;

public class GroupEmployeesByDepartment {

    // Employee class inside single class
    static class Employee {
    	//attributes
        String name;
        String department;

        //constructor
        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        //overriding method to display employee details
        @Override
        public String toString() {
            return name;
        }
    }

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input employees
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            employees.add(new Employee(name, dept));
        }

        // Grouping by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee e : employees) {
            departmentMap
                    .computeIfAbsent(e.department, k -> new ArrayList<>())
                    .add(e);
        }

        // Display result
        System.out.println("\n--- Employees Grouped by Department ---");
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
