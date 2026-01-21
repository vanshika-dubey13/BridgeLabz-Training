package dsa.scenariobased.sorting;

import java.util.Scanner;

public class FoodFest {

    //helper method to perform merge sort
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // method to perform merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // displaying array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking user input
        System.out.print("Enter total number of stalls: ");
        int n = sc.nextInt();
        int[] footfall = new int[n];
        System.out.println("Enter footfall counts (zone-wise sorted data):");
        for (int i = 0; i < n; i++) {
            footfall[i] = sc.nextInt();
        }

        //displaying results
        System.out.println("\nZone-wise Combined Data:");
        printArray(footfall);
        mergeSort(footfall, 0, n - 1);
        System.out.println("\nMaster Sorted Footfall List:");
        printArray(footfall);

        sc.close();
    }
}

