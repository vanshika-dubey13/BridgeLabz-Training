package com.oopsscenariobased.birdsanctuary;

public class Kiwi extends Bird {

    public Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }

    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Kiwi | No special abilities");
    }
}
