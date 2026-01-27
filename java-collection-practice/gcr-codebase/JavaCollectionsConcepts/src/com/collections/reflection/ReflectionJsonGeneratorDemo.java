package com.collections.reflection;

import java.lang.reflect.Field;

class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ReflectionJsonGeneratorDemo {

    // Convert object to JSON-like string using Reflection
    public static String toJson(Object obj) {

        if (obj == null) return "null";

        StringBuilder json = new StringBuilder();
        Class<?> cls = obj.getClass();

        json.append("{");

        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                json.append("\"").append(field.getName()).append("\":");

                Object value = field.get(obj);

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {

        Student student = new Student(101, "Amit", 92.5);

        String json = toJson(student);

        System.out.println(json);
    }
}
