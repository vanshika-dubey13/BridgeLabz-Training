package com.dsa.hashmap.mycustomhashmap;

import java.util.Scanner;

class MyHashMapMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();
        //displaying menu
        System.out.println("Welcome to my custom HashMap");
        System.out.println("1.Put  2.Get  3.Remove  4.Exit");

        while (true) {
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter key and value: ");
                int key = sc.nextInt();
                int value = sc.nextInt();
                map.put(key, value);
                System.out.println("Inserted");

            } else if (choice == 2) {
                System.out.print("Enter key: ");
                int key = sc.nextInt();
                System.out.println("Value: " + map.get(key));

            } else if (choice == 3) {
                System.out.print("Enter key: ");
                int key = sc.nextInt();
                map.remove(key);
                System.out.println("Removed");

            } else {
                break;
            }
        }

        sc.close();
    }
}
