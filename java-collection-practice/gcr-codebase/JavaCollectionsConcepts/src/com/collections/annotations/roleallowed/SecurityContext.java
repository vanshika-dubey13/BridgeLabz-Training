package com.collections.annotations.roleallowed;

public class SecurityContext {

    private static final ThreadLocal<String> currentRole = new ThreadLocal<>();

    public static void setRole(String role) {
        currentRole.set(role);
    }

    public static String getRole() {
        return currentRole.get();
    }
}

