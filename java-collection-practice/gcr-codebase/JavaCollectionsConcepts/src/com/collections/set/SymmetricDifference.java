package com.collections.set;
public class SymmetricDifference {

    // method to check if an element exists in an array
    public static boolean contains(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element)
                return true;
        }
        return false;
    }
    
    //method to print array
    public static void printArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    }

    //main method
    public static void main(String[] args) {

        int[] set1 = {1, 2, 3};
        int[] set2 = {3, 4, 5};

        int[] symDiff = new int[set1.length + set2.length];
        int size = 0;

        // looking for elements which are in set1 but not in set2
        for (int i = 0; i < set1.length; i++) {
            if (!contains(set2, set2.length, set1[i])) {
                symDiff[size++] = set1[i];
            }
        }

        
        // looking for elements which are in set2 but not in set1
        for (int i = 0; i < set2.length; i++) {
            if (!contains(set1, set1.length, set2[i])) {
                symDiff[size++] = set2[i];
            }
        }

        // displaying result
        System.out.println("Elements in set 1: ");
        printArray(set1);
        System.out.println();
        System.out.println("Elements in set 2: ");
        printArray(set2);
        System.out.println();
        System.out.print("Symmetric Difference: { ");
        printArray(symDiff);
        System.out.println("}");
    }
}
