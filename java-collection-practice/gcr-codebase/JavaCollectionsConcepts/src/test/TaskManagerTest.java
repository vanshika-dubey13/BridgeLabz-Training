package com.collections.junit.taskmanager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    TaskManager manager = new TaskManager();

    @Test
    @Timeout(2) // test fails if execution takes more than 2 seconds
    void testLongRunningTaskTimeout() {
        String result = manager.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
