package com.collections.queue;

import java.util.*;

public class GenerateBinaryNumbers {

	//method to generate a binary number
    public static void generateBinaryNumber(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 1; i <= n; i++) {
            String current = q.remove();
            System.out.print(current + " ");
            q.add(current + "0");
            q.add(current + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int N = sc.nextInt();
        generateBinaryNumber(N);
    }
}

