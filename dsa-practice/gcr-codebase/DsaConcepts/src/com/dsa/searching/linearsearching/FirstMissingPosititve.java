package com.dsa.searching.linearsearching;

import java.util.Scanner;
public class FirstMissingPosititve{
	
	public static int firstMissing(int[] arr) {
		int n = arr.length;
		boolean[] present = new boolean[n + 1];

		// Marking existing positive numbers
		for (int num : arr) {
			if (num > 0 && num <= n) {
				present[num] = true;
			}
		}

		// Find the first missing positive
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				return i;
			}
		}

		return n + 1;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			//asking size and elements of array from user
			System.out.println("Enter size of array :");
			int size = sc.nextInt();
			int[] nums = new int[size];
			for(int i=0; i<size; i++) {
				System.out.println("Enter " +(i+1) +" value : ");
				nums[i] = sc.nextInt();
			}
		
			System.out.println("First Missing number is : " +firstMissing(nums));
		}
}
