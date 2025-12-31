package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

class Department {
	
	//attributes
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
        System.out.println("Department created: " + departmentName);
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}
