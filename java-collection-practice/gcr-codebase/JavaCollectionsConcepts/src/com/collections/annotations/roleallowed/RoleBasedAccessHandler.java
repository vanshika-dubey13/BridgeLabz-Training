package com.collections.annotations.roleallowed;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RoleBasedAccessHandler implements InvocationHandler {

    private final Object target;

    public RoleBasedAccessHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Class<?> targetClass = target.getClass();

        if (targetClass.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed =
                    targetClass.getAnnotation(RoleAllowed.class);

            String requiredRole = roleAllowed.value();
            String currentRole = SecurityContext.getRole();

            if (!requiredRole.equals(currentRole)) {
                System.out.println("Access Denied!");
                return null;
            }
        }

        return method.invoke(target, args);
    }
}

