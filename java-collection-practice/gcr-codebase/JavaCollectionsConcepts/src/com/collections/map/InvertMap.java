package com.collections.map;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.*;

public class InvertMap {

	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> originalMap = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input map entries
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();

            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();

            originalMap.put(key, value);
        }

        // Inverted map: Value -> List of Keys
        Map<Integer, List<String>> invertMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
        	invertMap
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        // Display result
        System.out.println("\nOriginal Map: " + originalMap);
        System.out.println("Inverted Map: " + invertMap);

        sc.close();
    }
}
