package com.dsa.sorting;

public class HeapSort {

    // Method to perform Heap Sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }
    
    public static void heapify(int[] salaries, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        // Checking left child
        if (leftChild < heapSize && salaries[leftChild] > salaries[largest]) {
            largest = leftChild;
        }
        // Checking right child
        if (rightChild < heapSize && salaries[rightChild] > salaries[largest]) {
            largest = rightChild;
        }
        if (largest != rootIndex) {
            int temp = salaries[rootIndex];
            salaries[rootIndex] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, heapSize, largest);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 80000, 55000, 70000};
        //displaying result before sorting
        System.out.println("Before Sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
        heapSort(salaryDemands);
        //displaying result before sorting
        System.out.println("\n\nAfter Sorting:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}