package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Dr. " + name + " (" + specialization + 
                           ") is consulting patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}
