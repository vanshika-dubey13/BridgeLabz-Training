package dsa.scenariobased.sorting;

import java.util.Scanner;

public class CinemaHouse {

	//method to perform bubble sort
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for(int i=0; i<n-1; i++) {
			swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	//method to display array
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of movies : ");
		int size = sc.nextInt();
		int[] showtimes = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter showtime for movie " +(i+1) +" : ");
			showtimes[i] = sc.nextInt();
		}
		
		//displaying result
		System.out.println("\nBefore sorting showtime : ");
		printArray(showtimes);
		System.out.println("\nAfter sorting showtime : ");
		bubbleSort(showtimes);
		printArray(showtimes);
	}
}
