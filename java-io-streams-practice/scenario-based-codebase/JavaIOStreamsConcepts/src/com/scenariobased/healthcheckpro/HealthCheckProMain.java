package com.scenariobased.healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckProMain {

	//main method
    public static void main(String[] args) {

        Class<?> controllerClass = LabTestController.class;

        System.out.println("API Documentation for: "
                + controllerClass.getSimpleName());
        System.out.println("----------------------------------");

        for (Method method : controllerClass.getDeclaredMethods()) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean requiresAuth = method.isAnnotationPresent(RequiresAuth.class);

            if (!isPublicAPI) {
                System.out.println("WARNING: Method '"
                        + method.getName()
                        + "' is missing @PublicAPI annotation");
                continue;
            }

            PublicAPI api = method.getAnnotation(PublicAPI.class);
            System.out.println("API Name: " + method.getName());
            System.out.println("Description: " + api.description());

            if (requiresAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println("Authentication Required: YES");
                System.out.println("Role: " + auth.role());
            } else {
                System.out.println("Authentication Required: NO");
            }

            System.out.println();
        }
    }
}

