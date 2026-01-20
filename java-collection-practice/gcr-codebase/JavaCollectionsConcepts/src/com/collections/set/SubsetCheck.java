package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {

	//method to check common values in both the sets
    public static boolean contains(Set<Integer> set, int value) {
        for (int x : set) {
            if (x == value) {
                return true;
            }
        }
        return false;
    }

    //method to check if set1 is subset of set2
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        for (int x : set1) {
            if (!contains(set2, x)) {
                return false;
            }
        }
        return true;
    }

    //main method
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        //displaying results
        System.out.println(isSubset(set1, set2)); 
    }
}

