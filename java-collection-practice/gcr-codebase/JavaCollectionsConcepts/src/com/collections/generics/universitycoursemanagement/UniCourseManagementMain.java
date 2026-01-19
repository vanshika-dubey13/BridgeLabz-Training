package com.collections.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class
public class UniCourseManagementMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of course, their details and storing it into a list
		System.out.println("Enter the number of Course : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		List<Course<? extends CourseType>> courses = new ArrayList<> () ;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the details of the course  "+(i+1)+": ") ;
			System.out.println("Enter course name : ") ;
			String name = sc.nextLine();
			System.out.println("Enter department name : ") ;
			String department = sc.nextLine() ;
			System.out.println("Enter the type of Evaluation(Exam/Assignment/Research) : ") ;
			String type = sc.nextLine().toLowerCase();	
			Course<? extends CourseType> course ;
			switch(type) {
			case "exam" :
				course = new Course<>(name, department, new ExamCourse()) ;
				break ;
			case "assignment" :
				course = new Course<>(name, department, new AssignmentCourse()) ;
				break ;
			case "research" :
				course = new Course<>(name, department, new ResearchCourse()) ;
				break ;
			default : 
				System.out.println("Invalid Type!") ;
				course = new Course<>(name, department, new ExamCourse()) ;
			}
			
			courses.add(course) ;
		}
		
		//displaying result
		System.out.println("Course Catalog ----") ;
		for(Course<? extends CourseType> c : courses) {
			c.displayDetails();
		}

	}

}
