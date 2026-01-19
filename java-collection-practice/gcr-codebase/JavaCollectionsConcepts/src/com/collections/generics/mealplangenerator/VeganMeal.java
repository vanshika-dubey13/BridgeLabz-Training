package com.collections.generics.mealplangenerator;

//creating VeganMeal class that implements MealPlan
public class VeganMeal implements MealPlan{

	//overriding method of interface
	@Override
	public String getDescription() {
		return "Vegan Meal : Rice, lentils, chickpeas, tofu, mixed vegetables, spinach, tomatoes, onions, garlic, ginger, spices, cooking oil, nuts, seeds, and fresh herbs." ;
	}
}
