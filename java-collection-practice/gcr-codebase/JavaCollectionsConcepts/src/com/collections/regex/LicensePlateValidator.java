package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate license plate
public class LicensePlateValidator {

	//method to check if license plate is valid
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return Pattern.matches(regex, plate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a license plate number: ");
        String plate = sc.nextLine();

        if (isValidLicensePlate(plate)) {
            System.out.println(plate + " → Valid");
        } else {
            System.out.println(plate + " → Invalid");
        }

        sc.close();
    }
}

