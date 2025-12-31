package com.objectorienteddesign;

public class Departments {
	
	//attributes
    private String name;

    public Departments(String name) {
        this.name = name;
    }

    public void closeDepartments() {
        System.out.println("Department " + name + " is closed.");
    }

    //displaying department name
    public String getName() {
        return name;
    }
}
