package com.oopsscenariobased.birdsanctuary;

import java.util.*;
import java.lang.reflect.*;

public class BirdSanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void displayAll() {
        birds.forEach(Bird::displayInfo);
    }

    public void displayFlyable() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmable() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    public void removeById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    // Reflection usage
    public void showDeveloperInfo() {
        for (Bird b : birds) {
            Class<?> cls = b.getClass();
            if (cls.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
                System.out.println(cls.getSimpleName() + " -> " +
                        info.developer() + ", v" + info.version());
            }
        }
    }
}
