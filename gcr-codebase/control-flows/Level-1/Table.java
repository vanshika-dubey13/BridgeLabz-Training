// Creating a class to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;
public class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter number : ");
		int num = sc.nextInt(); 
		
		//ZPrint table if num is 6,7,8,9.
		if ( num >=6 && num <=9) {	
			for(int i=1; i<=10; i++){
				System.out.println(num + " * " + i + " = " + num*i );

			}
					}
		else{
		System.out.print("Number is not in range" );

		}
	sc.close();

	}
}