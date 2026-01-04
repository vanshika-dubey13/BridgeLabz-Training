package com.dsa.stack.stockspan;
import java.util.Scanner;

public class StockSpanMain {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of days: ");
	        int n = sc.nextInt();
	        //asking for number of days from user
	        int[] prices = new int[n];
	        System.out.println("Enter stock prices:");
	        for (int i = 0; i < n; i++) {
	            prices[i] = sc.nextInt();
	        }
	        
	       //calculating stock span via stack
	        int[] span = StockSpan.calculateSpan(prices);

	        //displaying results
	        System.out.println("Stock Spans:");
	        for (int s : span) {
	            System.out.print(s + " ");
	        }
	        sc.close();
	    }
	}
