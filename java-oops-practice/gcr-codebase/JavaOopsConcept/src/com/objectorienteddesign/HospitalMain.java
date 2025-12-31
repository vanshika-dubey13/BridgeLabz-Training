package com.objectorienteddesign;

public class HospitalMain {
    public static void main(String[] args) {
    	
    	//creating object of hospital for different hospitals
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Smith", "Cardiology");
        Doctor d2 = new Doctor("Jones", "Neurology");

        Patient p1 = new Patient("Alice", 30);
        Patient p2 = new Patient("Bob", 45);

        //adding doctors to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Doctor-Patient communication
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.showHospitalInfo();
    }
}
