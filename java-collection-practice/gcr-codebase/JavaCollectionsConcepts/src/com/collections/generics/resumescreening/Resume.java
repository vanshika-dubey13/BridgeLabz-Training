package com.collections.generics.resumescreening;

public class Resume <T extends JobRole>{

	//private variables to ensure limited access
	private String candidateName ;
	private int yearsOfExperience ;
	private T jobRole ;
	
	//constructor
	public Resume(String candidateName, int yearsOfExperience, T jobRole) {
		this.candidateName = candidateName ;
		this.yearsOfExperience =  yearsOfExperience ;
		this.jobRole = jobRole ;
	}  
	
	//getter methods to get candidate name, years of experience and job role
	public String getCandidateName() {
		return candidateName ;
		
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience ;
		
	}
	
	public T getJobRole() {
		return jobRole ;
	}
	
	//method to display resume
	public void displayResume() {
		System.out.println("Candidate: " + candidateName + " | Experience: " + yearsOfExperience + " years" +" | Role Applied: " + jobRole);

	}
}
