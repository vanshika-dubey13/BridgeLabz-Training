package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate hex color
public class HexColorValidator {

	//method
    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return Pattern.matches(regex, color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String color = sc.nextLine();
        if (isValidHexColor(color)) {
            System.out.println(color + " → Valid");
        } else {
            System.out.println(color + " → Invalid");
        }

        sc.close();
    }
}

