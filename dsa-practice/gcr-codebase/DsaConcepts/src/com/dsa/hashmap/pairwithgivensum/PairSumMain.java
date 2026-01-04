package com.dsa.hashmap.pairwithgivensum;
import java.util.Scanner;
public class PairSumMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//taking arr and targetSumas user input
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
	    System.out.println("Enter the elements:");
	    for (int i = 0; i < n; i++) {
	    		arr[i] = sc.nextInt();
	    }
	    System.out.print("Enter target sum: ");
	    int target = sc.nextInt();
	    
	    //checking if pair exists
	    boolean result = PairSum.hasPairWithSum(arr, target);

	    //displaying results
	    if (result) {
	    	System.out.println("Pair with given sum exists.");
	    }
	    else {
	        System.out.println("No pair with given sum found.");
	    }
	    
	    sc.close();
	    
	    }
	}
