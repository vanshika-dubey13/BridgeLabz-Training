package com.collections.reflection;

import java.lang.reflect.Field;

class Person {
	//private attribute
    private int age;
}

public class ReflectionPrivateFieldDemo {

	//main method
    public static void main(String[] args) {

        try {
            // Creating Person object
            Person person = new Person();

            // Getting Class object
            Class<?> cls = person.getClass();

            // Accessing private field 'age'
            Field ageField = cls.getDeclaredField("age");

            // Allowing access to private field
            ageField.setAccessible(true);

            // Modifying private field
            ageField.setInt(person, 30);

            // Retrieving private field value
            int ageValue = ageField.getInt(person);

            System.out.println("Age value using Reflection: " + ageValue);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

