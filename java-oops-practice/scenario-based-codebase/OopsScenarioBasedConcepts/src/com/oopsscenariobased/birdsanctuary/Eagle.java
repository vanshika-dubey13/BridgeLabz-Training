package com.oopsscenariobased.birdsanctuary;

@DeveloperInfo(developer = "EcoWing Team", version = "1.0", lastModified = "2026-01-10")
public class Eagle extends Bird implements Flyable {

    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " soars high in the sky.");
    }

    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Eagle | Flyable");
    }
}
