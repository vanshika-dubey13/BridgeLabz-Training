//Creating a class RocketLaunchWhile to launch a rocket at counter 1 using for loop

import java.util.Scanner;

public class RocketLaunchFor{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a counter : ");
	int counter = sc.nextInt();
	
	//Checking when counter turns 1
	for( int i=counter; i>=1; i=i-1 ){
		System.out.println("Counter : " + i);
	}

	sc.close();
	}
}