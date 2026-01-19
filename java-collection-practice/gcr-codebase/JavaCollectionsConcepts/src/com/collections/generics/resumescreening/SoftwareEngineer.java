package com.collections.generics.resumescreening;

//creating SoftwareEngineer as subclass of JobRole class 
public class SoftwareEngineer extends JobRole{

	//constructor
	public SoftwareEngineer() {
		super("Sofware Engineer") ;
	}
	
	@Override
	public String toString() {
		return "Software Engineer" ;
	}
	
}
