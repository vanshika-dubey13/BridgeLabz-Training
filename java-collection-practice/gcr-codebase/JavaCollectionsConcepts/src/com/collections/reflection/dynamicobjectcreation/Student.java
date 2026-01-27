package com.collections.reflection.dynamicobjectcreation;

class Student {
	//private attributes
    private int id;
    private String name;
    private double marks;

    //method to display student details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
