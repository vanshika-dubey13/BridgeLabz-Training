package com.collections.lists;

import java.util.*;

public class ReverseAList {

    // method to reverse an ArrayList
    public static void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    // method to reverse a LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }

        // reversing both lists
        reverseArrayList(arrayList);
        reverseLinkedList(linkedList);

        //displaying result
        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);

        sc.close();
    }
}
