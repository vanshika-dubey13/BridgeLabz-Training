package com.objectorienteddesign;

public class CompanyMain {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.getDepartment(0).addEmployee("Alice");
        company.getDepartment(0).addEmployee("Bob");
        company.getDepartment(1).addEmployee("Charlie");

        company.showCompany();

        // When company reference is removed, departments and employees are also gone
        company = null;
        System.out.println("\nCompany deleted. Departments and Employees are deleted too.");
    }
}
