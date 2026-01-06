package com.oopsscenariobased.collegeinformationsystem;

public abstract class Person {
	
	//attributes
    protected int id;
    protected String name;
    protected String email;

    //constructors
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract void printDetails();
}
