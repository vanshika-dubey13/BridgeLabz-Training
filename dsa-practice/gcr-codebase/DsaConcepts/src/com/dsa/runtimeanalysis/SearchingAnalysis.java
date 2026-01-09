package com.dsa.runtimeanalysis;

import java.util.*;

public class SearchingAnalysis {

	//method to perform linear search
    public static long linearSearch(int[] arr, int target) {
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                break;
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    //method to perform binary search
    public static long binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        long start = System.nanoTime();
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    //main method
    public static void main(String[] args) {
    	//taking array size, elements & target as user ip
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        long linearTime = linearSearch(nums, target);
        System.out.println("Time taken by Linear Search: " + linearTime + " ns");

        //for binary search, array must be sorted
        Arrays.sort(nums); 

        long binaryTime = binarySearch(nums, target);
        System.out.println("Time taken by Binary Search: " + binaryTime + " ns");

        sc.close();
    }
}
