package com.collections.junit.stringutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("madam", StringUtils.reverse("madam"));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("Racecar")); // case-insensitive
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("Java"));
        assertNull(StringUtils.toUpperCase(null));
    }
}
