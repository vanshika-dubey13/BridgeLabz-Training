package com.searching.binarysearching;

import java.util.Scanner;

public class PeakElementInArray {

    public static int findPeakEle(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // peak is on left side 
                right = mid;
            }
            else {
                // peak is on right side
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //asking user for size and elements of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        //displaying results
        int ans = findPeakEle(arr);
        System.out.println("Peak element index is: " + ans);
        System.out.println("Peak element value is: " + arr[ans]);

        sc.close();
    }
}
