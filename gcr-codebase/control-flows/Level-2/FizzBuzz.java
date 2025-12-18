

import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){ 
	
	//Taking a number
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
		
	//Checking if person can vote
	if (num >= 0){
		for(int i=1; i<=num; i++){
			if( i%3 ==0 ){
			System.out.println("Fizz");
			}
		else if( i%5 ==0 ){
			System.out.println("FizzBuzz");
			}
		else{
			System.out.println(i);

			}
	
		}}	
	}
}