package com.searching.binarysearching;

import java.util.Scanner;

public class FirstAndLastOccurence {
	
	//method for searching the first occurence of targeted element
	public static int firstOccurrence(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
		    if (arr[mid] == target) {
		    	result = mid;     
		    	//checking left
		        right = mid - 1;     
		    }
		    else if (arr[mid] < target) {
		         left = mid + 1;
		    }
		    else {
		            right = mid - 1;
		    }
		   
		 }
		    return result;
	}
	
	//method for searching the last occurence of targeted element
	public static int lastOccurrence(int[] arr, int target) {
	    int left = 0, right = arr.length - 1;
	    int result = -1;

	    while (left <= right) {
	    	int mid = left + (right - left) / 2;

	        if (arr[mid] == target) {
	        	 // storing index
	            result = mid;  
	            // searching right
	            left = mid + 1;    
	        }
	        else if (arr[mid] < target) {
	            	left = mid + 1;
	        }
	        else {
	            right = mid - 1;
	        }
	    }

	    return result;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//asking arr size and elements from user
		System.out.println("Enter size of arr : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter " + (i+1) +" element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target to be searched : ");
		int target = sc.nextInt();
		
		int ans = firstOccurrence(arr,target);
		System.out.println("First occurence is at index : " +ans);
		
		int ans2 = lastOccurrence(arr,target);
		System.out.println("Last occurence is at index : " +ans2);
	}
}
