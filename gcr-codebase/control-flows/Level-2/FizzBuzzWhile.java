

import java.util.Scanner;
public class FizzBuzzWhile{
	public static void main(String[] args){ 
	
	//Taking a number
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int i=1;
	
	if (num >= 0){
		while(i<=num){
			if( i%3 ==0 ){
			System.out.println("Fizz");
			}
		else if( i%5 ==0 ){
			System.out.println("FizzBuzz");
			}
		else{
			System.out.println(i);

			}i++;
	
		}}	
	}
}