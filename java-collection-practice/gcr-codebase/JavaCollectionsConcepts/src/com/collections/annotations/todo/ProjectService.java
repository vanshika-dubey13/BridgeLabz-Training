package com.collections.annotations.todo;

// Applying annotation to multiple methods
class ProjectService {

	@Todo(
			task = "Implement user authentication",
			assignedTo = "Amit",
			priority = "HIGH"
			)
	public void loginFeature() {
	}

	@Todo(
			task = "Add email notifications",
			assignedTo = "Riya"
			)
	public void notificationFeature() {
	}

	@Todo(
			task = "Optimize database queries",
			assignedTo = "Rahul",
			priority = "LOW"
			)
	public void optimizationFeature() {
	}

	public void completedFeature() {
	}
}
