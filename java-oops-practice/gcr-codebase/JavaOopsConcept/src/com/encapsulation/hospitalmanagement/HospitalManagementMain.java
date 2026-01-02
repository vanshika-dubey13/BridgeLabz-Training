package com.encapsulation.hospitalmanagement;

//main method
public class HospitalManagementMain {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 30, "Surgery", 5, 2000);
        Patient p2 = new OutPatient(102, "Anita", 25, "Flu", 500);

        p1.addRecord("Admitted to ICU");
        p1.addRecord("Surgery completed");

        p2.addRecord("Prescribed medication");

        displayPatientInfo(p1);
        displayPatientInfo(p2);
    }

    public static void displayPatientInfo(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Diagnosis: " + patient.getDiagnosis());
        patient.viewRecords();
        System.out.println("Total Bill: Rs" + patient.calculateBill());
        System.out.println("--------------------------------");
    }
}
