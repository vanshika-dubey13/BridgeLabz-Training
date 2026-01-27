package com.collections.junit.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> 
            registration.registerUser("Vanshika", "vanshika@example.com", "StrongPass1")
        );
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("", "user@example.com", "StrongPass1")
        );
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("User", "invalid-email", "StrongPass1")
        );
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("User", "user@example.com", "123")
        );
        assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }

    @Test
    void testNullValues() {
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser(null, "user@example.com", "StrongPass1")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("User", null, "StrongPass1")
        );
        assertThrows(IllegalArgumentException.class, () -> 
            registration.registerUser("User", "user@example.com", null)
        );
    }
}
