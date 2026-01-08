package com.oopsscenariobased.eventmanagementplatform;

//User (Event Organizer)
public class User {
	
	//attributes
	private String name;
	private String email; 

	//constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//returning event organizer's name
	public String getName() {
		return name;
	}
}

