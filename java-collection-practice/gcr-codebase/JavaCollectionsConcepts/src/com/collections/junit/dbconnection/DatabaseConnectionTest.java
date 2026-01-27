package com.collections.junit.dbconnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect(); // initialize connection before each test
    }

    @AfterEach
    void tearDown() {
        db.disconnect(); // close connection after each test
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before test runs");
    }

    @Test
    void testConnectionClosedAfterTest() {
        // At this point, connection is active
        assertTrue(db.isConnected());

        // Simulate test logic
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected after calling disconnect()");
    }
}
