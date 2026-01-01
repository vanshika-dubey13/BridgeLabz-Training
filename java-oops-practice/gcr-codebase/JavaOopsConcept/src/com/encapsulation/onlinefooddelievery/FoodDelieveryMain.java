package com.encapsulation.onlinefooddelievery;

//Main class
public class FoodDelieveryMain {
 public static void main(String[] args) {
	 
	 //Creating objects for veg and non veg food

     FoodItem veg = new VegItem("Paneer Burger", 120, 2);
     FoodItem nonVeg = new NonVegItem("Chicken Pizza", 250, 1);

     //displaying results
     OrderProcessor.processOrder(veg);
     OrderProcessor.processOrder(nonVeg);
 }
}
