//Creating a class to check if the first is the smallest of the 3 numbers.


import java.util.Scanner;
public class IsFirstSmallest{
	public static void main(String[] args){ 
	
	//Taking 3 numbers from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 3 number : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if (num1 < num2  && num1 < num3){
		System.out.print("Is the first number the smallest? " + "YES");
		}
	else {
		System.out.print("Is the first number the smallest? " + "NO");

		}
	}
}