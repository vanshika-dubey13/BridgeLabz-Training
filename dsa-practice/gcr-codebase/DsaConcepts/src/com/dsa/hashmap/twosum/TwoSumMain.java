package com.dsa.hashmap.twosum;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner;

public class TwoSumMain {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        //taking arr and targetsum as user ip
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        //finding possible indices
        int[] result = TwoSum.findTwoSum(arr, target);

        //displaying result
        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }

        sc.close();
    }
}
