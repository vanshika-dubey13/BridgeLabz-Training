package dsa.scenariobased.sorting;

import java.util.Scanner;

public class RoboWarehouse {
	
	//method to perform insertion sort on weight
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	
	//method to print array
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items : ");
		int size = sc.nextInt();
		int[] weights = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter weight of "+(i+1)+" item : ");
			weights[i] = sc.nextInt();
		}
		
		//displaying results
		System.out.println("\nWeights before sorting : ");
		printArray(weights);
		System.out.println("\nWeights after sorting : ");
		insertionSort(weights);
		printArray(weights);
	}
}
