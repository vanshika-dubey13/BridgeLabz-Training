package com.dsa.stack.slidingwindowsum;

import java.util.Scanner;

class SlidingWindowMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //asking window size from user
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();
        //calculating max element in corresponding window size 
        int[] maxWindow = SlidingWindow.maxSlidingWindow(nums, k);

        //displaying result
        System.out.println("Maximums of each sliding window:");
        for (int val : maxWindow) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
