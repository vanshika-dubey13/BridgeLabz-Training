package com.dsa.hashmap.subarrayswithzerosum;

import java.util.*;

class ZeroSumSubarrays {

    public static void findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // Case 1 Subarray from index 0 to i
            if (sum == 0) {
                System.out.println("Subarray found from index 0 to " + i);
                found = true;
            }
            // Case 2 Sum already exists
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index " + (startIndex + 1) + " to " + i);
                    found = true;
                }
            }
            // Storing the sum with index
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        //when no subarray with 0 sum is found
        if (!found) {
            System.out.println("No subarray with zero sum found.");
        }
    }
}
