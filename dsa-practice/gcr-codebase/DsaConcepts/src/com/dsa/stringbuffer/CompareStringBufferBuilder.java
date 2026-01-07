package com.dsa.stringbuffer;

public class CompareStringBufferBuilder {

    public static void main(String[] args) {

    	//fixing iterations
        int iterations = 1000000;
        String text = "hello";

        // StringBuffer performance test
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // StringBuilder performance test
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // Displaying results
        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
