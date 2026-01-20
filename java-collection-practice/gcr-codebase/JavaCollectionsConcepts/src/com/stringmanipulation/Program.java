package com.stringmanipulation;

import java.util.Scanner;

public class Program {

	//method to perform specified operations on string
    public static String CleanseAndInvert(String input) {

        // checking is string is null or less than length of 6
        if (input == null || input.length() < 6) {
            return "";
        }

        // checking if string does not contain spaces,digits, special chars
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
                return "";
            }
        }

        // converting string to lowercase
        input = input.toLowerCase();

        // removing characters with even ASCII values
        String filtered = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((int) ch % 2 != 0) {   
            	// keeping only odd ASCII chars
                filtered = filtered + ch;
            }
        }

        // reversing the filtered string
        String reversed = "";
        for (int i = filtered.length() - 1; i >= 0; i--) {
            reversed = reversed + filtered.charAt(i);
        }

        // converting even index characters to uppercase
        String result = "";
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (i % 2 == 0) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        String output = CleanseAndInvert(input);

        if (output.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + output);
        }
        sc.close();
    }
}

