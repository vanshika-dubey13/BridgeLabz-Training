package com.collections.set;

import java.util.Set;
import java.util.HashSet;

public class EqualSetCheck {

	//method to check if two sets are equal 
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() != set2.size()) {
            return false;
        }
        // Copying set2 to remove matched elements
        Set<Integer> temp = new HashSet<>(set2);
        for (int element : set1) {
            if (!temp.contains(element)) {
                return false;
            }
            temp.remove(element);
        }
        return temp.isEmpty();
    }

    //main method
    public static void main(String[] args) {

    	//creating 2 different sets and adding values to it
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        
        ///displaying results
        System.out.println(areSetsEqual(set1, set2));
    }
}
