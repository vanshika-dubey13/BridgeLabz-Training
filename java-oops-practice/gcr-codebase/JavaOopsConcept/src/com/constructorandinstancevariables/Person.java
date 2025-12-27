package com.constructorandinstancevariables;

public class Person {
	//creating attributes for person
	String name;
	int age;
	String gender;
	
	//parametrized constructor
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//copy constructor
	Person(Person previousPerson){
		this.name = previousPerson.name;
		this.age = previousPerson.age;
		this.gender = previousPerson.gender;
	}
	
	//displaying person's details
	public void displayPersonDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age :  "+ age);
		System.out.println("Gender : "+ gender);
	}
	
	public static void main(String[] args) {
		//parametrized constructor
		Person person1 = new Person("Alina",21,"F");
		System.out.println("Person 1 details :");
		person1.displayPersonDetails();
		
		System.out.println("---");
		//copy constructor
		Person person2 = new Person(person1);
		System.out.println("Person 2 details cloned using person 1 details: ");
		person2.displayPersonDetails();

	}

}
