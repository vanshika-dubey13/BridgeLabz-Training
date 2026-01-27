package com.collections.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

//creating a class to validate ip address
public class IPAddressValidator {

	//method to check if ip address is valid
    public static boolean isValidIPv4(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
                     + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an IPv4 address: ");
        String ip = sc.nextLine();

        if (isValidIPv4(ip)) {
            System.out.println(ip + " → Valid IPv4 address");
        } else {
            System.out.println(ip + " → Invalid IPv4 address");
        }

        sc.close();
    }
}

