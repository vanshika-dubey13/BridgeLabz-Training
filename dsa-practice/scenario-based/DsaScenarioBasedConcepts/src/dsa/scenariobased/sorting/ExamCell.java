package dsa.scenariobased.sorting;

import java.util.Scanner;

public class ExamCell {

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
    
  //method to display array
  	public static void printArray(int[] arr) {
  		for(int i=0; i<arr.length; i++) {
  			System.out.print(arr[i] +" ");
  		}
  	}
    // Main method
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int size = sc.nextInt();
		int[] marks = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter marks for student " +(i+1) +" : ");
			marks[i] = sc.nextInt();
		}
		
		//displaying result
		System.out.println("\nBefore sorting showtime : ");
		printArray(marks);
		System.out.println("\nAfter sorting showtime : ");
		mergeSort(marks, 0, marks.length-1);
		printArray(marks);
	}
}