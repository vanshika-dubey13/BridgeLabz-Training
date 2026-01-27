package com.collections.regex;

import java.util.Scanner;

//creating a class to reduce spaces
public class SpaceReducer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with multiple spaces:");
        String input = sc.nextLine();
        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s{2,}", " ");

        System.out.println("\nModified String:");
        System.out.println(output);

        sc.close();
    }
}

