package com.dsa.sorting;

public class MergeSort {

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
    // Main method
    public static void main(String[] args) {
        int[] bookPrices = {450, 299, 150, 999, 550, 200};
        //displaying result before sorting
        System.out.println("Before Sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
        mergeSort(bookPrices, 0, bookPrices.length - 1);
      //displaying result after sorting
        System.out.println("\n\nAfter Sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
