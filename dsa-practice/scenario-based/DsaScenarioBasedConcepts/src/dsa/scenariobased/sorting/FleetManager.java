package dsa.scenariobased.sorting;

import java.util.Scanner;

public class FleetManager {

    // Method to perform merge sort
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Sorting left half
            mergeSort(prices, left, mid);
            // Sorting right half
            mergeSort(prices, mid + 1, right);
            // Merging the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copying data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = prices[mid + 1 + j];
        int i = 0, j = 0, k = left;

        // Merging the arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Copying remaining elements
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
  //method to display arr
  	public static void printArr(int[] arr) {
  		for(int i=0; i<arr.length; i++) {
  			System.out.print(arr[i] +" ");
  		}
  	}
  	
    // Main method
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of artists : ");
    	int size =sc.nextInt();
    	int[] mileage = new int[size];
    	for(int i=0; i<size; i++) {
    		System.out.println("Enter registration timr of "+(i+1)+" artist :");
    		mileage[i]=sc.nextInt();
    	}
	
    	//displaying results
    	System.out.println("\nBefore sorting : ");
    	printArr(mileage);
    	System.out.println("\nAfter sorting : ");
    	mergeSort(mileage, 0, mileage.length - 1);
    	printArr(mileage);

    }
}