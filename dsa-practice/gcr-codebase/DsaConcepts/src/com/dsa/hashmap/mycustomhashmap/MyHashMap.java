package com.dsa.hashmap.mycustomhashmap;

public class MyHashMap {
    // Node for linked list
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // bucket size
    private int SIZE = 10;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Updating
    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];

        Node current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert at beginning
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // Retrieving value
    public int get(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        // key not found
        return -1;
    }

    // Removing key
    public void remove(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
