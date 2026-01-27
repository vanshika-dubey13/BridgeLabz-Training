package com.collections.junit.taskmanager;

public class TaskManager {
    public String longRunningTask() {
        try {
            Thread.sleep(3000); // simulate long task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
