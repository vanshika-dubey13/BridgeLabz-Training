//Creating a class to print largest of 3 numbers

import java.util.Scanner;
public class LargestOfThree{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	//Taking 3 numbers from user
	System.out.print("Enter 3 numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();

	if( (num1 > num2) && (num1 > num3) ){
		System.out.print("Number 1 is largest");
		}
	else if( (num2 > num1) && (num2 > num3) ){
		System.out.print("Number 2 is largest");
		}
	else{
		System.out.print("Number 3 is largest");

		}
sc.close();

	}
}