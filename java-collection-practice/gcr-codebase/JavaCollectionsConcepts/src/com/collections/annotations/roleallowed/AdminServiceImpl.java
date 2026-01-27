package com.collections.annotations.roleallowed;

@RoleAllowed("ADMIN")
public class AdminServiceImpl implements AdminService {

    @Override
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }
}

