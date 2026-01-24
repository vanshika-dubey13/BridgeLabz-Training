package com.collections.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//creating a class to show the behaviour of unchecked exception
public class UncheckedException {

	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //asking user ip for 2 numbers
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");

        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");

        }
        finally {
            sc.close();
        }
    }
}

