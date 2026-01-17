package dsa.scenariobased.sorting;

import java.util.Scanner;

public class ArtExpo {

	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	//method to display arr
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of artists : ");
		int size =sc.nextInt();
		int[] artists = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter registration timr of "+(i+1)+" artist :");
			artists[i]=sc.nextInt();
		}
		
		//displaying results
		System.out.println("\nBefore sorting : ");
		printArr(artists);
		System.out.println("\nAfter sorting : ");
		insertionSort(artists);
		printArr(artists);

	}

}
