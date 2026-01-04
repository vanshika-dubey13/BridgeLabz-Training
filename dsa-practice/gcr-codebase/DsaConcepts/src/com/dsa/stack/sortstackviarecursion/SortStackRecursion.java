package com.dsa.stack.sortstackviarecursion;

import java.util.Stack;
import java.util.Stack;

class SortStackRecursion {

    // Sorting the stack using recursion
    void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertSorted(stack, top);
        }
    }

    // Inserting element in sorted order
    void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }
}
