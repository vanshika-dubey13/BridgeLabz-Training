package com.dsa.sorting;

import java.util.*; 

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }

    public static void main(String[] args) {
        int[] marks = {60, 55, 98, 74, 92};
        //printing before swapping
        System.out.println("Marks before swapping :");
        for(int i:marks) {
        	System.out.print(i +", ");
        }
        System.out.println();
        bubbleSort(marks);
        System.out.println("Marks after swapping :");
        System.out.println(Arrays.toString(marks));
    }
}