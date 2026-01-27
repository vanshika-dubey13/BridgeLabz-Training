package com.collections.junit.dateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    void testValidDate() throws ParseException {
        assertEquals("26-01-2026", DateFormatter.formatDate("2026-01-26"),
                "Date should be converted correctly");
        assertEquals("01-12-2025", DateFormatter.formatDate("2025-12-01"),
                "Date should be converted correctly");
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> {
            DateFormatter.formatDate("26/01/2026"); // wrong format
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(ParseException.class, () -> {
            DateFormatter.formatDate("2026-02-30"); // invalid day
        });
    }

    @Test
    void testNullOrEmptyDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("");
        });
    }
}