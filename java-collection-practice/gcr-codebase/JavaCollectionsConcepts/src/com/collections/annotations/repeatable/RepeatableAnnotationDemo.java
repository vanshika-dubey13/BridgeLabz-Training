package com.collections.annotations.repeatable;

import java.lang.reflect.Method;

// Retrieving repeatable annotations using Reflection
public class RepeatableAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method method = BugTracker.class.getMethod("submitBug");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println("Bug: " + bug.description());
        }
    }
}
