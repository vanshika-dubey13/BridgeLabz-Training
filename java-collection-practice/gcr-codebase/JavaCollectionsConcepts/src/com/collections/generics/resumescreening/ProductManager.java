package com.collections.generics.resumescreening;

//creating ProductManager as subclass of JobRole
public class ProductManager extends JobRole{

	//constructor
	public ProductManager() {
		super("Product Manager") ;
	}
	
	@Override
	public String toString() {
		return "Product Manager" ;
	}
	
}
