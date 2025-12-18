import java.util.Scanner;

public class UnitPrice{
	public static void main(String [] args){
	 // Creating Scanner object to take input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the unit price : ");
	int unitPrice = sc.nextInt();
	System.out.println("Enter the quantity : ");
	int quantity = sc.nextInt();

	//Calculating totalPrice
	int totalPrice = unitPrice * quantity;

	//Displaying results
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	sc.close():
	}
}
