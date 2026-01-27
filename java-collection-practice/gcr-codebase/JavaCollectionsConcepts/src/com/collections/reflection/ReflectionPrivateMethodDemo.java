package com.collections.reflection;

import java.lang.reflect.Method;

class Calculator {

    // Private method
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class ReflectionPrivateMethodDemo {

	//main method
    public static void main(String[] args) {

        try {
            // Creating object of Calculator
            Calculator calculator = new Calculator();

            // Getting Class object
            Class<?> cls = calculator.getClass();

            // Getting private method 'multiply'
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Allowing access to private method
            method.setAccessible(true);

            // Invoking private method
            int result = (int) method.invoke(calculator, 5, 4);

            // Displaying result
            System.out.println("Result of multiply(): " + result);

        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

