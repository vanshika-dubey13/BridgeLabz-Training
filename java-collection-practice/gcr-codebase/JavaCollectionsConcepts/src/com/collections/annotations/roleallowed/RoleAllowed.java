package com.collections.annotations.roleallowed;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleAllowed {
    String value();
}

