package com.collections.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations2 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class ReflectionDynamicMethodDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create object dynamically (FULLY QUALIFIED NAME)
            Class<?> cls = Class.forName("com.collections.reflection.MathOperations2");
            Object obj = cls.getDeclaredConstructor().newInstance();

            // User input
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.next();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method
            int result = (int) method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Invalid method name!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
