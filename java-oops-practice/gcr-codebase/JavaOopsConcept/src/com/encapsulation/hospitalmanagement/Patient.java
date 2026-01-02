package com.encapsulation.hospitalmanagement;

import java.util.ArrayList;

//abstract class
public abstract class Patient implements MedicalRecord {
	//attributes
    protected int patientId;
    protected String name;
    protected int age;

    // Encapsulation
    private String diagnosis;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // (getters/setters)
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // overriding method of parent class
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

 // overriding method of parent class
    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}
