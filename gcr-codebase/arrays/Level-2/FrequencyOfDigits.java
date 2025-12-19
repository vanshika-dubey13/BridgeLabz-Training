//Creating a class to  take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

import java.util.Scanner;
public class FrequencyOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		//Finding the count of digits in the number
		int ogNum = num;
		int count =0;
		while( ogNum != 0){
			count++;
			ogNum = ogNum/10;
		}
		//Creating a digit array to store each digit of number
		int [] digits = new int [count];
		for(int i=0; i<count; i++){
			digits[i] = (int) (num % 10);
			num/=10;
		}
		//Creating a frequency array to store frequency of each digit of number
		int [] frequency = new int[10];
		for(int i=0; i<count; i++){
			frequency[digits[i]]++;
			}

		ogNum = num;


		//Displaying the frequency of each digit of number
		for(int i=0; i<10; i++){
			if( frequency[i] >0){
				System.out.println("Digit is : "+ i +", frequency is : "+ frequency[i]);
			}
			
		}

	sc.close();
		
	}
}