package com.objectorienteddesign;

import java.util.ArrayList;
import java.util.List;

class Patient {
	
	//attributes
    private String name;
    private int age;
    private List<Doctor> doctors;

    //setting patien's name and age
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public String getName() {
        return name;
    }
}
