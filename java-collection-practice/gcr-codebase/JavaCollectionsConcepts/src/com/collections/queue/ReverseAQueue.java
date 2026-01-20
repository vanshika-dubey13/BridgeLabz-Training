package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {

    // Recursive method to reverse the queue
    static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        // Removing front element
        int front = q.remove();
        // Reversing remaining queue
        reverseQueue(q);
        // Adding removed element to the rear
        q.add(front);
    }

    //main method
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        
        //displaying results
        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}

