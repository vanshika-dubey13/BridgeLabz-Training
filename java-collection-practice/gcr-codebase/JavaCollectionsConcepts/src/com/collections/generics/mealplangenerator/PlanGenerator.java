package com.collections.generics.mealplangenerator;

public class PlanGenerator {

	//method for validating and returning meal plan
	public static <T extends MealPlan> Meal<T> generateMealPlan(String userName, T plan) {
		System.out.println("Validating meal plan---") ;
		return new Meal<>(userName, plan) ;
	}
	
}
