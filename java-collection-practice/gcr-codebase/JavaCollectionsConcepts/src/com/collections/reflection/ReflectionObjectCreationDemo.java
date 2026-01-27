package com.collections.reflection;

import java.lang.reflect.Constructor;

import java.lang.reflect.Constructor;

class Students {

	//attributes
    public int id;
    public String name;

    // No-argument constructor
    public Students() {
        this.id = 1;
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ReflectionObjectCreationDemo {

    public static void main(String[] args) {

        try {
            // Loading class dynamically (FULL package name)
            Class<?> cls = Class.forName("com.collections.reflection.Students");

            // Get no-argument constructor
            Constructor<?> constructor = cls.getDeclaredConstructor();

            // Creating object dynamically
            Object obj = constructor.newInstance();

            // Casting and using object
            Students students = (Students) obj;
            students.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
