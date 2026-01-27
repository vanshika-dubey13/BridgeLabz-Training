package com.collections.reflection.dynamicobjectcreation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectionObjectMapperDemo {

    // Generic object mapper method
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            // Create object dynamically
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                // Access field
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);

                // Set field value
                field.set(obj, fieldValue);
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //main method
    public static void main(String[] args) {

        // Input data
        Map<String, Object> studentData = new HashMap<>();
        studentData.put("id", 101);
        studentData.put("name", "Vanshika");
        studentData.put("marks", 89.5);

        // Map to object
        Student student = toObject(Student.class, studentData);

        // Displaying result
        student.display();
    }
}

