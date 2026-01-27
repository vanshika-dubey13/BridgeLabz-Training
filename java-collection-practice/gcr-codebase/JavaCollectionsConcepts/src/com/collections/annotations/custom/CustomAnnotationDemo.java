package com.collections.annotations.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Retrieving annotation using Reflection
public class CustomAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Class<TaskManager> cls = TaskManager.class;
        Method method = cls.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Task Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}

