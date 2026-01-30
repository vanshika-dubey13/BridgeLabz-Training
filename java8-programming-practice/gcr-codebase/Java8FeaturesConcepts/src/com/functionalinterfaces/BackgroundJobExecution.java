package com.functionalinterfaces;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable using lambda
        Runnable jobExecution = () -> {
            System.out.println("Background job is running...");
        };

        Thread thread = new Thread(jobExecution);
        thread.start();
    }
}

