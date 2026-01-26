package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // method for push operation
    public void push(int x) {
        //  Add element to q2
        q2.add(x);
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        //  Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // method to perform pop operation
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    // method to find top operation
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }

    // method to check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    //main method
    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();
        Scanner sc = new Scanner(System.in);

        //displaying menu
        while (true) {
            System.out.println("\n--- Stack Using Queues ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val + " pushed");
                }
                case 2 -> {
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped: " + popped);
                }
                case 3 -> {
                    int top = stack.top();
                    if (top != -1)
                        System.out.println("Top: " + top);
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
