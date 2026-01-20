package com.collections.lists;

import java.util.*;

public class RemoveDuplicatesWhilePreservingOrder {

    // method to remove duplicates while maintaining order
    public static List<Integer> removeDuplicates(List<Integer> list) {
    	// LinkedHashSet preserves insertion order
        Set<Integer> seen = new LinkedHashSet<>();
        for (Integer num : list) {
            seen.add(num);   
        }
        return new ArrayList<>(seen);
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> result = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + result);
        sc.close();
    }
}

