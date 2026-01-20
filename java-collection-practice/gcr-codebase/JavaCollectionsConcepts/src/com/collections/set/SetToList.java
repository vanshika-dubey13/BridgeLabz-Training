package com.collections.set;

import java.util.*;

public class SetToList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(52029);
        set.add(3233);
        set.add(911);
        set.add(12839);

        // converting Set to List 
        List<Integer> list = new ArrayList<>();
        for (int x : set) {
            list.add(x);
        }
        
        System.out.println("Before sorting : ");
        System.out.println(list);
        // Manual sorting using bubble sort
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        //displaying results
        System.out.println("\nAfter sorting : ");
        System.out.println(list);
    }
}
