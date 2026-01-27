package com.collections.regex;

//creating a class to validate ip address
public class ValidateIPAddress {
    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "256.100.50.0";

        System.out.println(ip1 + " is valid? " + isValidIP(ip1));
        System.out.println(ip2 + " is valid? " + isValidIP(ip2));
    }

    public static boolean isValidIP(String ip) {
        // Splitting by dot
        String[] parts = ip.split("\\.");
        
        // IPv4 must have exactly 4 parts
        if (parts.length != 4) return false;

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                // Each number must be between 0 and 255
                if (num < 0 || num > 255) return false;
                // Prevent leading zeros like "01", "001"
                if (!String.valueOf(num).equals(part)) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}

