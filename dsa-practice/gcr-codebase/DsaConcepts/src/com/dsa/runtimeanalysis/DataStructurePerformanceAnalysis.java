package com.dsa.runtimeanalysis;

import java.util.HashSet;
import java.util.TreeSet;

//creating a class to compare performance of hashset & treeset
public class DataStructurePerformanceAnalysis {

    public static void main(String[] args) {

        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long startArray = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) break;
        }
        long endArray = System.nanoTime();

        long startHashSet = System.nanoTime();
        hashSet.contains(target);
        long endHashSet = System.nanoTime();

        long startTreeSet = System.nanoTime();
        treeSet.contains(target);
        long endTreeSet = System.nanoTime();

        System.out.println("Array Search Time   : " +
                (endArray - startArray) / 1_000_000.0 + " ms");

        System.out.println("HashSet Search Time : " +
                (endHashSet - startHashSet) / 1_000_000.0 + " ms");

        System.out.println("TreeSet Search Time : " +
                (endTreeSet - startTreeSet) / 1_000_000.0 + " ms");
    }
}