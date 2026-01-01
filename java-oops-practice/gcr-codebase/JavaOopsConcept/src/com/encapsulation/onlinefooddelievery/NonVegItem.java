package com.encapsulation.onlinefooddelievery;

//Non-Veg Item class
class NonVegItem extends FoodItem implements Discountable {

	//attribute
	private static final double NON_VEG_CHARGE = 50.0;

	//constructor
	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}	

	//overriding method of parent class
	@Override
	public double calculateTotalPrice() {
		return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
	}

	//overriding method of parent class
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.05; // 5% discount
	}

	//overriding method of parent class
	@Override
	public String getDiscountDetails() {
		return "Non-Veg Item Discount: 5%";
	}
}