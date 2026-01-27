package com.collections.junit.passwordvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"), "Password should be valid");
        assertTrue(PasswordValidator.isValid("HelloWorld9"), "Password should be valid");
    }

    @Test
    void testTooShortPassword() {
        assertFalse(PasswordValidator.isValid("Ab1"), "Password too short should be invalid");
    }

    @Test
    void testMissingUppercase() {
        assertFalse(PasswordValidator.isValid("password123"), "Password without uppercase should be invalid");
    }

    @Test
    void testMissingDigit() {
        assertFalse(PasswordValidator.isValid("Password"), "Password without digit should be invalid");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Null password should be invalid");
    }
}
