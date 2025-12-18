//Creating a class RocketLaunchWhile to launch a rocket at counter 1

import java.util.Scanner;

public class RocketLaunchWhile{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a counter : ");
	int counter = sc.nextInt();

	//Checking when counter turns 1
	while(counter != 1){
		System.out.println("Counter : " + counter);
		counter = counter -1;
		}System.out.println("Counter : " + counter);

	}
}