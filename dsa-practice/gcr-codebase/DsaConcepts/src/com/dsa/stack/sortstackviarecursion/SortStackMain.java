package com.dsa.stack.sortstackviarecursion;

import java.util.Stack;
import java.util.Stack;

public class SortStackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        SortStackRecursion ops = new SortStackRecursion();

        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);

        //displaying original and sorted stack
        System.out.println("Original Stack: " + stack);
        ops.sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
