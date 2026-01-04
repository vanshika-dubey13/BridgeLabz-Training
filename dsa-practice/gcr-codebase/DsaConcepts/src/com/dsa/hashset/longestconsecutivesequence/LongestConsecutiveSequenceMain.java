package com.dsa.hashset.longestconsecutivesequence;

import java.util.Scanner;

class LongestConsecutiveSequenceMain {
    public static void main(String[] args) {
    	
    	//taking arr as user ip
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //finding the longest common sequence
        int result = LongestConsecutiveSequence.longestConsecutiveSequence(arr);
        //displaying result
        System.out.println("Length of longest consecutive sequence: " + result);

        sc.close();
    }
}
