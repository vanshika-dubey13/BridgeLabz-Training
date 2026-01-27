package com.collections.annotations.jsonfield;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        User user = new User("john_doe", 25, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}

