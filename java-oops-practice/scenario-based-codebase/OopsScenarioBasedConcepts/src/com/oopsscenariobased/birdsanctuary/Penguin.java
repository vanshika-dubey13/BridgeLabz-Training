package com.oopsscenariobased.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " swims underwater.");
    }

    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Penguin | Swimmable");
    }
}
