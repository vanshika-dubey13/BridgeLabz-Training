package com.streamapi;

import java.util.*;

//class Doctor to store doctor's details
class Doctor {
	//attributes
    String name;
    String specialty;
    boolean availableOnWeekend;

    //constructor
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    //overriding method to display doctor details
    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Alice", "Neurology", false),
            new Doctor("Dr. John", "Orthopedics", true),
            new Doctor("Dr. Emma", "Dermatology", true)
        );

        doctors.stream()
        	// weekend availability
            .filter(Doctor::isAvailableOnWeekend)  
            // sort by specialty
            .sorted(Comparator.comparing(Doctor::getSpecialty)) 
            .forEach(System.out::println);
    }
}

