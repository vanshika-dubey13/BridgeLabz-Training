package com.collections.generics.resumescreening;
import java.util.*;
//driver class for all other classes in AI-Driven Resume Screening System
public class ResumeScreeningSystemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for their name, year of experience, job role they are looking for 
		System.out.println("Enter candidate name : ") ;
		String name = sc.nextLine();
		
		System.out.println("Enter years of experience: ") ;
		int exp = sc.nextInt();
		sc.nextLine() ;
		
		System.out.println("Enter job role (SoftwareEngineer/DataScientist/ProductManager)");
		String role = sc.nextLine().toLowerCase();
		
		Resume<? extends JobRole> resume ;
		
		//displaying result according to user choice
		switch(role) {
			case "software engineer" : 
				resume = new Resume<> (name, exp, new SoftwareEngineer()) ;
				break ;	
			case "data scientist" : 
				resume = new Resume<>(name, exp, new DataScientist()) ;
				break ;
			case "product manager" : 
				resume = new Resume<>(name, exp, new ProductManager()) ;
				break ;
			default :
				System.out.println("Invalid Role!") ;
				resume = new Resume<>(name, exp, new SoftwareEngineer() ) ;
			}
		
			//displaying results
			resume.displayResume() ;
			ResumeScreening.screenResume(resume) ;
			List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager()) ;
			ResumeScreening.processJobRoles(roles) ;
			sc.close();
	}

}
