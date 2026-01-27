package com.collections.annotations.maxlength;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("john_doe"); // OK
        System.out.println("User created successfully");

        User user2 = new User("this_username_is_too_long"); // Exception
    }
}

