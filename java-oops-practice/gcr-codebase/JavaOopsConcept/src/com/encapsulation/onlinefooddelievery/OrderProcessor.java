package com.encapsulation.onlinefooddelievery;


class OrderProcessor {

 public static void processOrder(FoodItem item) {
	 
	 //displaying item details
     System.out.println(item.getItemDetails());
     System.out.println("Total Price: " + item.calculateTotalPrice());

     if (item instanceof Discountable) {
         Discountable d = (Discountable) item;
         System.out.println(d.getDiscountDetails());
         System.out.println("Discount Amount: " + d.applyDiscount());
     }

     System.out.println("---------------------------");
 	}
}