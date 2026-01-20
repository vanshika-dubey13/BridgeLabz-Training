package com.collections.lists;

import java.util.*;

public class NElementFromEnd {

    // method to find Nth element from end
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return "N is greater than the number of elements";
            }
            fast.next();
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        System.out.print("Enter N: ");
        int pos = sc.nextInt();

        String result = findNthFromEnd(list, pos);
        
        //displaying results
        System.out.println("Nth element from end: " + result);
        sc.close();
    }
}

