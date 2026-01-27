package com.collections.annotations.todo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


// retrivingand print all pending tasks using Reflection
public class TodoAnnotationDemo {

    public static void main(String[] args) {

        Class<ProjectService> cls = ProjectService.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method: " + method.getName());
                System.out.println(" Task       : " + todo.task());
                System.out.println(" Assigned To: " + todo.assignedTo());
                System.out.println(" Priority   : " + todo.priority());
                System.out.println("----------------------------------");
            }
        }
    }
}

