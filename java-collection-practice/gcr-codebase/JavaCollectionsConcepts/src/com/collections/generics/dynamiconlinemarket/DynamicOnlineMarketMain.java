package com.collections.generics.dynamiconlinemarket;

import java.util.Scanner;

//driver class for other classes in DynamicOnlineMarketplace
public class DynamicOnlineMarketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking input for number of products, their details, calling methods and constructors and displaying result
		System.out.println("Enter the number of products :") ;
		int n = sc.nextInt() ;
		sc.nextLine();
		for(int i = 0; i < n; i ++) {
			System.out.println("Enter the details of the product : ") ;
			System.out.println("Enter the product category (Book/Clothing/Gadget): ") ;
			String categoryInput = sc.nextLine();	
			System.out.println("Enter the product name : ") ;
			String name = sc.nextLine();	
			System.out.println("Enter the product price : ") ;
			double price = sc.nextDouble();

			Product<?> product ;
			switch(categoryInput.toLowerCase()) {
			case "book" :
				product = new Product<>(name, price, new BookCategory()) ;
				break ;
			case "clothing" :
				product = new Product<>(name, price, new ClothingCategory()) ;
				break ;
			case "gadget" :
				product = new Product<>(name, price, new GadgetCategory()) ;
				break ;
			default :
				System.out.println("Invalid Category!") ;
				product = new Product<>(name, price, new BookCategory()) ;
				break ;
			}
			
			System.out.println("Enter the discount percentage : ") ;
			double discount = sc.nextDouble();
			sc.nextLine() ;		
			System.out.println("Applying Discount") ;
			product.applyDiscount(discount) ;
			System.out.println("Final price of " + product.getName() +": " + product.getPrice()) ;
		}
		sc.close();
	}
}
