package com.collections.junit.passwordvalidator;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null) return false;

        // Must be at least 8 characters
        if (password.length() < 8) return false;

        // Must contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) return false;

        // Must contain at least one digit
        if (!password.matches(".*\\d.*")) return false;

        return true;
    }
}
