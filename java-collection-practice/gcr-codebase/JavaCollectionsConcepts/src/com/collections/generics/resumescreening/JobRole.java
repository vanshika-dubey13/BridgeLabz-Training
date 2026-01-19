package com.collections.generics.resumescreening;

//creating JobRole abstract class 
public abstract class JobRole {

	//attributes
	private String roleName ;

	//constructor
	public JobRole(String roleName) {
		this.roleName =  roleName ;
		
	}
	
	//getters
	public String getRoleName() {
		return roleName ;
		
	}
	
	public abstract String toString() ;
	
}