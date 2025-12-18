//Creating a class to check whether a number is positive, negative, or zero.



import java.util.Scanner;
public class CheckingNumber{
	public static void main(String[] args){ 
	
	//Taking a number from user 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	
	//Checking if number is positive, negative, or zero.
	if (num >= 0){
		System.out.print("Positive"); 
		}
	else if(num < 0){
		System.out.print("Negative");
		}
	else{
		System.out.print("Zero");

		}

	}
}