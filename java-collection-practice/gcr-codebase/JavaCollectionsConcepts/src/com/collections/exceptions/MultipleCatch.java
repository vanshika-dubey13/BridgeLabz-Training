package com.collections.exceptions;

import java.util.Scanner;

//creating a class to demonstrate the usage of multiple catch blocks
public class MultipleCatch {

	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = null;   

        try {
        	
        	//taking size of array and array elements as user input
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to retrieve: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        }
        
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        }
        
        finally {
            sc.close();
        }
    }
}

