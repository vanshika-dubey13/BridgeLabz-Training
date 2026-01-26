package com.collections.map;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxValueKey {

	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();

            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();

            map.put(key, value);
        }
        // Finding key with maximum value
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        if (maxKey != null) {
            System.out.println("\nKey with highest value: " + maxKey);
        } else {
            System.out.println("Map is empty");
        }

        sc.close();
    }
}
