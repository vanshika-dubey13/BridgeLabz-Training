//Creating a class to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
public class OddAndEvenInBetween{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Taking number range from user 	
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//Printing odd's and even's accordingly
		for(int i=1; i<=num; i++){
			if( i%2 == 0){
				System.out.println(i + " is even ");
			}
			else{
				System.out.println(i + " is odd ");
			}
		}
	sc.close();

	}
}