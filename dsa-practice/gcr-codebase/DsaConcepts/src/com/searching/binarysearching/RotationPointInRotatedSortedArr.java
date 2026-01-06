package com.searching.binarysearching;

import java.util.Scanner;
public class RotationPointInRotatedSortedArr {

	public static int searchInRotatedSortedArr(int[]arr) {
		int left = 0;
		int right = arr.length-1;
		int ans =-1;
		while(left!=right) {
			int mid = (left+right)/2;
			if(arr[mid] > arr[right]) {
				left = mid + 1;
			}
			else if(arr[mid] < arr[right]){
				right = mid;
				ans = mid;
			}
			
		}return ans;
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
		
		int ans = searchInRotatedSortedArr(arr);
		System.out.println("Rotation point is index : " +ans);
	}

}
