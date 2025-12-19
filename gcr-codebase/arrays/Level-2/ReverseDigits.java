//Creating a class to create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order


import java.util.Scanner;
public class ReverseDigits{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = sc.nextInt();
	int temp = n;
	//Finding the count of digits in the number
	int count =0;
	while( temp!=0 ){
		count = count + 1;
		temp = temp/10;
		}
	int digits[] = new int[count];
	temp = n;
	//Storing number's digit in reverse order
	int reverse =0; 
	for ( int i=0; i<count; i++ ){
		 digits[i]  = temp%10;
	temp = temp /10;
		}
	
	//Displaying reversed digits in array 
	System.out.print("Reversed array :\n");
	for( int i=0; i<digits.length; i++){
	System.out.print(digits[i] + ", ");
	}
	sc.close();
	}
}