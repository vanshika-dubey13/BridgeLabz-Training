package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

class Company {
	
	//attributes
    private String companyName;
    private List<Department> departments = new ArrayList<>();

    //setting and displaying company name
    Company(String companyName) {
        this.companyName = companyName;
        System.out.println("Company created: " + companyName);
    }

    //adding the department
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    Department getDepartment(int index) {
        return departments.get(index);
    }

    void showCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.showDepartment();
        }
    }
}
