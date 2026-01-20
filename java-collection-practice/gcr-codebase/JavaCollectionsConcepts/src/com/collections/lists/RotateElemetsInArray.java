package com.collections.lists;

import java.util.*;

public class RotateElemetsInArray {

    // method to rotate list to the left by k positions
    public static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        //handling rotations greater than size
        k = k % n; 
        List<Integer> temp = new ArrayList<>();
        // Adding elements from k to end
        for (int i = k; i < n; i++) {
            temp.add(list.get(i));
        }
        // Adding elements from start to k-1
        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }
        // Copying back to original list
        for (int i = 0; i < n; i++) {
            list.set(i, temp.get(i));
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();
        
        rotateList(list, k);

        System.out.println("Rotated List: " + list);
        sc.close();
    }
}

