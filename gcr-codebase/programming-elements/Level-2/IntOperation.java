//Creating a class to perform operations on 3 double values

import java.util.Scanner;
public class DoubleOpt {
	public static void main(String[] args){
	//Taking input through scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers: ");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();

	//Performing operations
	double operation1 = a + b *c;
	double operation2 = a * b + c;
	double operation3 = c  + a / b;
	double operation4 = a % b + c;

	//Displaying operations result
	System.out.println(operation1 + " " +  operation2 +  " " +operation3  + " " + operation4);
	}
}

import java.util.Scanner;
public class IntOperation {
	public static void main(String[] args){
	//Taking input through scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	//Performing operations
	int operation1 = a + b *c;
	int operation2 = a * b + c;
	int operation3 = c  + a / b;
	int operation4 = a % b + c;

	//Displaying operations result
	System.out.println(operation1 + " " +  operation2 +  " " +operation3  + " " + operation4);
	}
}