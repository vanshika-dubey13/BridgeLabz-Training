package com.dsa.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

//creating a class to compare performance of different sorting algorithms
public class SortingPerformanceAnalysis {

	//method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int N = 10_000;
        int[] data = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            data[i] = random.nextInt(N);
        }

        int[] bubbleData = data.clone();
        int[] mergeData = data.clone();
        int[] quickData = data.clone();

        // Bubble Sort
        long startBubble = System.nanoTime();
        bubbleSort(bubbleData);
        long endBubble = System.nanoTime();

        // Merge Sort (Java built-in)
        long startMerge = System.nanoTime();
        Arrays.sort(mergeData);
        long endMerge = System.nanoTime();

        // Quick Sort (Java built-in)
        long startQuick = System.nanoTime();
        Arrays.sort(quickData);
        long endQuick = System.nanoTime();

        System.out.println("Bubble Sort Time : " +
                (endBubble - startBubble) / 1_000_000.0 + " ms");

        System.out.println("Merge Sort Time  : " +
                (endMerge - startMerge) / 1_000_000.0 + " ms");

        System.out.println("Quick Sort Time  : " +
                (endQuick - startQuick) / 1_000_000.0 + " ms");
    }
}