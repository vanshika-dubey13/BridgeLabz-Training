//Creating a class to calculate maximum number of handshakes

import java.util.Scanner;
public class MaximumHandshakes{
	public static void main(String [] args){

	//Taking number of users as input
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	//Calculating total number of handshakes
	int totalShakes =  (n* (n-1)) /2;

	//Displaying total hand shakes
	System.out.println("Total handshakes done : " totalShakes");
	sc.close();
	}
}