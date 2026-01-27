package com.collections.annotations.loggingmethodexecutiontime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ExecutionTimeHandler implements InvocationHandler {

    private final Object target;

    public ExecutionTimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Method targetMethod =
                target.getClass().getMethod(method.getName(), method.getParameterTypes());

        if (targetMethod.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();

            Object result = method.invoke(target, args);

            long end = System.nanoTime();
            long duration = end - start;

            System.out.println(method.getName() +
                    " executed in " + duration + " ns");

            return result;
        }

        return method.invoke(target, args);
    }
}

