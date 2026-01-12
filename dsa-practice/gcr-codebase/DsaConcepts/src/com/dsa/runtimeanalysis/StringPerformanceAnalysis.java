package com.dsa.runtimeanalysis;

//creating a class to compare performance of stringbuffer and stringbuilder

public class StringPerformanceAnalysis {

    public static void main(String[] args) {

    	System.out.println("Starting string comparison");
        int N = 1_000_000;

        long startString = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "a";
        }
        long endString = System.nanoTime();

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        long endBuilder = System.nanoTime();
        

        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < N; i++) {
            buffer.append("a");
        }
        long endBuffer = System.nanoTime();

        System.out.println("String Time        : " +
                (endString - startString) / 1_000_000 + " ms");

        System.out.println("StringBuilder Time : " +
                (endBuilder - startBuilder) / 1_000_000 + " ms");

        System.out.println("StringBuffer Time  : " +
                (endBuffer - startBuffer) / 1_000_000 + " ms");
    }
}