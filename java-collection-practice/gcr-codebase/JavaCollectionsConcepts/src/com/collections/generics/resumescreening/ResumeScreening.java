package com.collections.generics.resumescreening;

import java.util.List;

//class for resume screening
public class ResumeScreening {

	//method to screen resume and check for eligible candidates and shirtlist them
	public static <T extends JobRole> void screenResume(Resume<T> resume) {
		System.out.println("Screening resume for : " +resume.getJobRole()) ;
		
		if(resume.getYearsOfExperience() >= 2) {
			System.out.println(resume.getCandidateName() +" Shortlisted for : "+resume.getJobRole()) ;
			
		}
		else {
			System.out.println(resume.getCandidateName() +" not shortlisted for : "+resume.getJobRole() +" due to insufficient work experience.") ;	
		}
	}
	public static void processJobRoles(List <? extends JobRole> roles) {
		System.out.println("Screening pipeline------") ;
		for(JobRole jr : roles) {
			System.out.println("Processing role : " +jr) ;
		}
	}
}
