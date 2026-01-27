package com.collections.reflection;

import java.lang.reflect.Method;

//Sample class with methods
class MathOperations {

	//method to add numbers
	public void addNumbers(int a, int b) {
		// Simulate work
		for (int i = 0; i < 1_000_000; i++);
	}

	//method to multiply numbers
	public void multiplyNumbers(int a, int b) {
		// Simulate work
		for (int i = 0; i < 2_000_000; i++);
	}

	//method to say hello
	public void printHello(String name) {
		System.out.println("Hello, " + name);
	}
}

public class MethodTimingReflectionDemo {

	public static void main(String[] args) {

		try {
			// Load class dynamically
			Class<?> cls = MathOperations.class;
			Object obj = cls.getDeclaredConstructor().newInstance();

			// Get all declared methods
			Method[] methods = cls.getDeclaredMethods();
			
			for (Method method : methods) {
				long startTime = System.nanoTime();

				// Prepare dummy arguments based on parameter types
				Object[] params = new Object[method.getParameterCount()];
				Class<?>[] paramTypes = method.getParameterTypes();
				for (int i = 0; i < paramTypes.length; i++) {
					if (paramTypes[i] == int.class) params[i] = 5;
					else if (paramTypes[i] == String.class) params[i] = "Alice";
					else params[i] = null;
				}

				// Invoke method
				method.invoke(obj, params);
				
				long endTime = System.nanoTime();
				long duration = endTime - startTime;

				System.out.println("Method: " + method.getName() + " executed in " + duration + " ns");
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
     
 	}
}

