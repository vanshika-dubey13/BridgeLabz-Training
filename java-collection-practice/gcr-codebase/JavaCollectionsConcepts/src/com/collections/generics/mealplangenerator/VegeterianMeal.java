package com.collections.generics.mealplangenerator;

//creating class VegitarianMeal extends MealPlan interface
public class VegeterianMeal implements MealPlan{
	
	//overriding method of interface
	@Override
	public String getDescription() {
		return "Vegitarian meal : Rice, wheat flour, paneer, mixed vegetables, lentils, spices, oil or ghee, curd, tomatoes, onions, green chilies, ginger, and fresh herbs." ;
	}
	
}
