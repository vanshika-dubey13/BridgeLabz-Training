package com.dsa.hashmap.pairwithgivensum;

import java.util.HashMap;
public class PairSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
