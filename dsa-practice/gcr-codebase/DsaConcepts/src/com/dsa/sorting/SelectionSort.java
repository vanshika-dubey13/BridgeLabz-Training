package com.dsa.sorting;

public class SelectionSort {

    // Method to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] examScores = {78, 92, 85, 66, 90, 73};
        //displaying result before sorting
        System.out.println("Before Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
        selectionSort(examScores);
      //displaying result after sorting
        System.out.println("\n\nAfter Sorting:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}