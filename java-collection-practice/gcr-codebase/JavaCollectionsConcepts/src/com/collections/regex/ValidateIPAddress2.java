package com.collections.regex;

import java.util.regex.*;

//creating a class to validate ip address
public class ValidateIPAddress2 {
    public static void main(String[] args) {
        String[] ips = {
            "192.168.0.1",   // valid
            "255.255.255.255", // valid
            "256.100.50.25", // invalid (256 > 255)
            "123.45.67",     // invalid (only 3 groups)
            "123.045.067.089" // invalid (leading zeros not allowed in strict IPv4)
        };

        // Regex for IPv4 validation
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        Pattern pattern = Pattern.compile(regex);
        for (String ip : ips) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + "\" is valid");
            } else {
                System.out.println(ip + "\" is invalid");
            }
        }
    }
}
