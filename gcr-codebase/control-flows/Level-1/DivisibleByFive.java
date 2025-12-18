//Creating a class to check if a number is divisible by 5

import java.util.Scanner;
public class DivisibleByFive{
	public static void main(String[] args){ 
	
	//Taking a number from user to check if it is divisible by 5
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	if (num % 5 == 0){
		System.out.print("Is the number " + num + " divisible by 5? " + "YES");
		}
	else {
		System.out.print("Is the number " + num + " divisible by 5? " + "NO");

		}
	}
}