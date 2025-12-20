//Creating a class to calculate maximum number of handshakes using a method

import java.util.Scanner;
public class MaximumHandshakes{

	//Creating a method to calculate maximum number of handshakes	

	public static int maxHandshakesCalculator( int n ){
		return ((n*(n-1)) / 2 );
	}


	public static void main(String [] args){

	//Taking number of users as input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of persons : ");
	int n = sc.nextInt();
	
	//Displaying total hand shakes
	int maxHandshakes = maxHandshakesCalculator(n);
	System.out.println("Total maximum handshakes done : "  + maxHandshakes);
	sc.close();
	}
}