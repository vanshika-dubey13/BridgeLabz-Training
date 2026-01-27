package com.collections.annotations.roleallowed;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        AdminService adminService = new AdminServiceImpl();

        AdminService proxy = (AdminService) Proxy.newProxyInstance(
                adminService.getClass().getClassLoader(),
                adminService.getClass().getInterfaces(),
                new RoleBasedAccessHandler(adminService)
        );

        // Simulate ADMIN user
        SecurityContext.setRole("ADMIN");
        proxy.deleteUser();

        // Simulate NON-ADMIN user
        SecurityContext.setRole("USER");
        proxy.deleteUser();
    }
}

