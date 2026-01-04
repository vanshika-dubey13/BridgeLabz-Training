package com.dsa.hashmap.subarrayswithzerosum;

import java.util.Scanner;

class ZeroSumSubarraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Zero-sum subarrays:");
        ZeroSumSubarrays.findSubarrays(arr);

        sc.close();
    }
}
