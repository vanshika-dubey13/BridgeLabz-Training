package com.dsa.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerOperations {
	
	//attributes
    private TaskNode head;
    // to track current task in circular list
    private TaskNode current; 
    
    // Adding task at end
    public void addTaskEnd(String id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;  // circular link
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
        System.out.println("Task added at end.");
    }

    // Adding task at beginning
    public void addTaskBeginning(String id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            newTask.next = head;
            head = newTask;
            temp.next = head;  // maintain circular link
        }
        System.out.println("Task added at beginning.");
    }

    // Adding task at specific position (1-based)
    public void addTaskAtPosition(String id, String name, int priority, String dueDate, int pos) {
        if (pos <= 1) {
            addTaskBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;
        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        System.out.println("Task added at position " + pos + ".");
    }

    // Removing task by Task ID
    public void removeTask(String id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head, prev = null;

        // Searching for task
        do {
            if (temp.taskId.equals(id)) {
                if (prev == null) { 
                	// head node
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    if (head.next == head) { 
                    	// only one node
                        head = null;
                        current = null;
                    } else {
                        head = head.next;
                        last.next = head;
                        if (current.taskId.equals(id))
                            current = head;
                    }
                } else {
                    prev.next = temp.next;
                    if (current.taskId.equals(id))
                        current = temp.next;
                }
                System.out.println("Task removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found.");
    }

    // Viewing current task
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Current Task: " + current.taskId + " - " + current.taskName);
        }
    }

    // Moving to next task
    public void moveToNextTask() {
        if (current != null)
            current = current.next;
    }

    // Displaying all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        TaskNode temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | Priority: " + temp.priority + " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Searching task by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        System.out.println("Tasks with priority " + priority + ":");
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " - " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found)
            System.out.println("No tasks found with this priority.");
    }
}
