package com.collections.annotations.repeatable;

//sing annotation multiple times
class BugTracker {

	@BugReport(description = "NullPointerException occurs on login")
	@BugReport(description = "UI freezes when submitting form")
	public void submitBug() {
		System.out.println("Submitting bug...");
	}
}
