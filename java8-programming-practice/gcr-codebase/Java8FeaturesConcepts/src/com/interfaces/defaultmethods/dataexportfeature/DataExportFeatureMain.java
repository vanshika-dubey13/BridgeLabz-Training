package com.interfaces.defaultmethods.dataexportfeature;

public class DataExportFeatureMain {
	public static void main(String[] args) {
		ReportExporter csv = new CSVExporter();
		csv.export();
		csv.exportToJSON();

		ReportExporter pdf = new PDFExporter();
		pdf.export();
		pdf.exportToJSON();
	}
}
