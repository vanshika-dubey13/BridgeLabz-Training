package com.functionalinterfaces;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int limit = 20;

        // Function to get length of a string
        Function<String, Integer> lengthFunc = String::length;

        String message = "Appointment confirmed successfully";

        if (lengthFunc.apply(message) > limit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}

