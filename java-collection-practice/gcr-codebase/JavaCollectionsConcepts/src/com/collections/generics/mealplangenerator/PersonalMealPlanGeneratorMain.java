package com.collections.generics.mealplangenerator;

import java.util.Scanner;

//driver class for all other classes in PersonalMealPlanGenerator
public class PersonalMealPlanGeneratorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for user name, their choice , calling methods and displaying result accordingly
		System.out.println("Enter your name : " ) ;
		String userName = sc.nextLine();
		System.out.println("Choose meal type(Vegitarian/Vegan/Keto/High-Protein) : ") ;
		String choice =sc.nextLine().toLowerCase() ;
		
		Meal<? extends MealPlan> meal;
		switch(choice) {
			case "vegeterian" : 
				meal = PlanGenerator.generateMealPlan(userName, new VegeterianMeal()) ;
				break ;
			
			case "vegan" : 
				meal = PlanGenerator.generateMealPlan(userName, new VeganMeal()) ;
				break ;
		
			case "keto" :
				meal = PlanGenerator.generateMealPlan(userName, new KetoMeal()) ;
				break ;
			
			case "high-protien" : 
				meal = PlanGenerator.generateMealPlan(userName, new HighProteinMeal()) ;
				break ;
			
			default : 
				System.out.println("Inavlid Choice! Assigning Vegitarian Meal") ;
				meal = PlanGenerator.generateMealPlan(userName, new VegeterianMeal()) ;
				break ;
			}
		
			meal.showMealPlan() ;
			sc.close();
	}

}
