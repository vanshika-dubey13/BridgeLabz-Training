package com.collections.reflection;

import java.lang.reflect.Field;

class Configuration {

    // Private static field
    private static String apiKey = "DEFAULT_KEY";
}

public class ReflectionStaticFieldDemo {

	//main method
    public static void main(String[] args) {

        try {
            // Get Class object
            Class<?> cls = Configuration.class;

            // Access private static field
            Field field = cls.getDeclaredField("apiKey");

            // Allow access
            field.setAccessible(true);

            // Modify static field (object reference = null)
            field.set(null, "NEW_SECRET_API_KEY");

            // Retrieve static field value
            String apiKeyValue = (String) field.get(null);

            System.out.println("Modified API_KEY: " + apiKeyValue);

        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

