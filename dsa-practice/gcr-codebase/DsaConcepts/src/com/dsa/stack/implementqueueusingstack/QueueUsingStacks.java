package com.dsa.stack.implementqueueusingstack;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {
	//creating queue via 2 stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Performing enqueue operation
    public void enqueue(int x) {
        s1.push(x);
        System.out.println(x + " inserted into queue");
    }

    // Performing dequeue operation
    public void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Removed element: " + s2.pop());
    }

    // Displaying queue
    public void display() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");

        // Printing stack2 (top to bottom)
        for (int i = s2.size() - 1; i >= 0; i--) {
            System.out.print(s2.get(i) + " ");
        }

        // Print stack1 (bottom to top)
        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.get(i) + " ");
        }

        System.out.println();
    }
}


