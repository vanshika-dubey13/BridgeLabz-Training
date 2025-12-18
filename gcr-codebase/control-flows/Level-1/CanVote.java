//Creating a class to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.


import java.util.Scanner;
public class CanVote{
	public static void main(String[] args){ 
	
	//Taking 3 numbers from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter age : ");
	int age = sc.nextInt();
		
	//Checking if person can vote
	if (age >= 18){
		System.out.print("The person's age is " + age + " and can vote.");
		}
	else {
		System.out.print("The person's age is " + age + " and cannot vote.");

		}
	}
}