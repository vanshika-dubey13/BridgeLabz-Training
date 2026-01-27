package com.collections.annotations.custom;

//	Using annotation in a class
class TaskManager {

	@TaskInfo(priority = "High", assignedTo = "Amit")
	public void completeTask() {
		System.out.println("Task is being completed");
	}
}