package com.oopsscenariobased.hospitalpatientmanagementsystem;

public class HospitalMain {
    public static void main(String[] args) {
        InPatient p1 = new InPatient("Alice", 28, "Fractured leg", 101);
        OutPatient p2 = new OutPatient("Bob", 35, "Checkup", "10:30 AM");

        Doctor d1 = new Doctor("Dr. Smith", "Orthopedics");
        Doctor d2 = new Doctor("Dr. Adams", "General Medicine");

        // emergency patient
        Bill bill1 = new Bill(200, 150, 10); 
        // normal patient
        Bill bill2 = new Bill(100, 50, 5);   

        p1.displayInfo();
        d1.displayInfo();
        bill1.displayBill();

        System.out.println();

        p2.displayInfo();
        d2.displayInfo();
        bill2.displayBill();
    }
}


