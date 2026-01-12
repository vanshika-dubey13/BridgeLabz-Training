package com.dsa.runtimeanalysis;

//creating a class to check performance of fibonacci series
public class FibonacciPerformanceAnalysis {
	
	//method to calculate fibonacci using recursion
	public static int fibonacciRecursive(int n) {
	    if (n <= 1) return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	//method to calculate fibonacci using iteration
	public static int fibonacciIterative(int n) {
	    if (n <= 1) return n;

	    int a = 0, b = 1, sum = 0;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}

	public static void main(String[] args) {

        int n = 30;

        long startRec = System.nanoTime();
        fibonacciRecursive(n);
        long endRec = System.nanoTime();

        long startIter = System.nanoTime();
        fibonacciIterative(n);
        long endIter = System.nanoTime();

        System.out.println("Recursive Time : " +
                (endRec - startRec) / 1_000_000.0 + " ms");

        System.out.println("Iterative Time : " +
                (endIter - startIter) / 1_000_000.0 + " ms");
    }
}