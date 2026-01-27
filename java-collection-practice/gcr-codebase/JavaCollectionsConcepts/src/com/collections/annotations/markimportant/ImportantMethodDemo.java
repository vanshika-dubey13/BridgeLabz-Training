package com.collections.annotations.markimportant;

import java.lang.reflect.Method;

// Retrieving annotated methods using Reflection
public class ImportantMethodDemo {

	//main method
    public static void main(String[] args) {

        Class<Service> cls = Service.class;
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);
                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + annotation.level()
                );
            }
        }
    }
}

