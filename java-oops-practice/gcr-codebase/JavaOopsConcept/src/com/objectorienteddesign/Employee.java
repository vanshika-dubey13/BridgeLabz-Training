package com.objectorienteddesign;

class Employee {
	
	//attributes
    private String name;

    //setting employee name
    Employee(String name) {
        this.name = name;
        System.out.println("Employee created: " + name);
    }

    //displaying employee details
    void showEmployee() {
        System.out.println("Employee Name: " + name);
    }
}
