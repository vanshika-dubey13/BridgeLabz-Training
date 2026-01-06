package com.dsa.sorting;

public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] empIds) {
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
        	// element to be inserted
            int key = empIds[i];   
            int j = i - 1;
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108};

      //displaying result before sorting
        System.out.println("Before Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIds);
        
        //displaying result after sorting
        System.out.println("\n\nAfter Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
