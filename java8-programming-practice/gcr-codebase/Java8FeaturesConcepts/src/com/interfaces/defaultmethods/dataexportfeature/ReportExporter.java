package com.interfaces.defaultmethods.dataexportfeature;

//interface to export reports
interface ReportExporter {
	void export();

	// Default JSON export
	default void exportToJSON() {
		System.out.println("Exporting report to JSON format (default implementation).");
	}
}
