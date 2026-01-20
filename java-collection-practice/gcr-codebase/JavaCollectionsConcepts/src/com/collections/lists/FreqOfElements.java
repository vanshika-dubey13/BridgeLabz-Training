package com.collections.lists;

import java.util.*;

public class FreqOfElements {

    // method to find frequency of elements
    public static Map<String, Integer> findFreq(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            } else {
                freqMap.put(item, 1);
            }
        }
        return freqMap;
    }

    //main method
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        //taking string list as user input
        List<String> list = new ArrayList<>();
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> result = findFreq(list);

        //displaying result
        System.out.println("Frequency of elements: " + result);

        sc.close();
    }
}

