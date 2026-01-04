package com.dsa.linkedlist.circularlinkedlist.taskscheduler;

public class TaskNode {
	
	//attributes
    String taskId;
    String taskName;
    int priority;
    String dueDate;
    // points to next task
    TaskNode next;  

    //constructor
    public TaskNode(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
