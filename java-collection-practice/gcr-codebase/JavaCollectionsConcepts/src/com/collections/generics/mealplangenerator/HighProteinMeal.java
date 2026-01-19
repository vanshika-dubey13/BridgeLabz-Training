package com.collections.generics.mealplangenerator;

//creating HighProteinMeal class that implements interface MealPlan
public class HighProteinMeal implements MealPlan{
	
	//overriding method of interface
	@Override
	public String getDescription() {
		return "High-Protein Meal: lean meats, legumes, and protein-rich foods." ;
	}
	
}
