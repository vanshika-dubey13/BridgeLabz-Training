package com.searching.linearsearching;

import java.util.Iterator;
import java.util.Scanner;
public class FirstNegativeNumInArr {

	//method to Search for the First Negative Number
	public static int firstNegativeNum(int[] arr) {
		
		int index =-1;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]<0) {
				index = i;
			}
		}return index;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//asking for size and arr elements from user
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter " + (i+1) +" element : ");
			arr[i] = sc.nextInt();
		}
		
		int ans = firstNegativeNum(arr);
		System.out.println("First negative number is at index : "+ ans);
			
	}

}
