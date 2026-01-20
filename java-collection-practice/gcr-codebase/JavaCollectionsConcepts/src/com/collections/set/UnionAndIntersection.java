package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

    // Method to check if an element exists in an array
    public static boolean contains(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] set1 = {1, 2, 3};
        int[] set2 = {3, 4, 5};

        int[] union = new int[set1.length + set2.length];
        int unionSize = 0;
        

        // checking for union
        for (int i = 0; i < set1.length; i++) {
            if (!contains(union, unionSize, set1[i])) {
                union[unionSize++] = set1[i];
            }
        }

        for (int i = 0; i < set2.length; i++) {
            if (!contains(union, unionSize, set2[i])) {
                union[unionSize++] = set2[i];
            }
        }

        // checking for intersection 
        int[] intersection = new int[Math.min(set1.length, set2.length)];
        int interSize = 0;

        for (int i = 0; i < set1.length; i++) {
            if (contains(set2, set2.length, set1[i])) {
                intersection[interSize++] = set1[i];
            }
        }

        // displaying results
        System.out.print("Union: { ");
        for (int i = 0; i < unionSize; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println("}");

        System.out.print("Intersection: { ");
        for (int i = 0; i < interSize; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println("}");
    }
}
