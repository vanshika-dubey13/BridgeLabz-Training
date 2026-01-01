package com.encapsulation.onlinefooddelievery;

//Veg Item class
class VegItem extends FoodItem implements Discountable {

	//constructor
	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	//overriding method of parent class
	@Override
	public double calculateTotalPrice() {
		return getPrice() * getQuantity();
	}

	//overriding method of parent class
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.10; // 10% discount
	}

	//overriding method of parent class
	@Override
	public String getDiscountDetails() {
		return "Veg Item Discount: 10%";
	}
}
