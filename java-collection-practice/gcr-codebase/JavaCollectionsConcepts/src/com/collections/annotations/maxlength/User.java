package com.collections.annotations.maxlength;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    private void validateMaxLength(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && value != null) {
                int max = maxLength.value();
                if (value.length() > max) {
                    throw new IllegalArgumentException(
                        "Username length must be <= " + max
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

