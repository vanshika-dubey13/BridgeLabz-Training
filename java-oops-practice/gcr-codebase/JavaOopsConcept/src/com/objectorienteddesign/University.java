package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Departments> departments; // Composition
    private List<Faculty> facultyMembers; // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartments(String deptName) {
        departments.add(new Departments(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);

        // Departments are destroyed with the University
        for (Departments d : departments) {
            d.closeDepartments();
        }
        departments.clear();

        System.out.println("University deleted.");
    }
}
