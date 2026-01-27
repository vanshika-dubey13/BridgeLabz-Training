package com.collections.annotations.markimportant;

// Applying annotation to methods
class Service {

	@ImportantMethod
	public void processData() {
		System.out.println("Processing data...");
	}

	@ImportantMethod(level = "MEDIUM")
	public void generateReport() {
		System.out.println("Generating report...");
	}

	public void helperMethod() {
		System.out.println("Helper method");
	}
}
