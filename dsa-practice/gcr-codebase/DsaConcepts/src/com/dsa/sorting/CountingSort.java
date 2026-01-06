package com.dsa.sorting;

public class CountingSort {

    // Method to perform Counting Sort
    public static int[] countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];
        
        for (int age : ages) {
            count[age - minAge]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }
        return output;
    }

    // Main method
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 14, 18, 11, 13, 16};
        //displaying results before sorting
        System.out.println("Before Sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
        int[] sortedAges = countingSort(studentAges);
      //displaying results before sorting
        System.out.println("\n\nAfter Sorting:");
        for (int age : sortedAges) {
            System.out.print(age + " ");
        }
    }
}
