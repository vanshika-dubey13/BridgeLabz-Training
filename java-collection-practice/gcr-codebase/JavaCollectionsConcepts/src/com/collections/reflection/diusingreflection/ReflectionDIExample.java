package com.collections.reflection.diusingreflection;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// Step 1: Define the @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}


// Step 5: Demonstrate DI
public class ReflectionDIExample {

    public static void main(String[] args) throws Exception {

        // Create DI container
        SimpleDIContainer container = new SimpleDIContainer();

        // Register client class
        Client client = new Client();
        container.register(ServiceA.class);
        container.register(ServiceB.class);

        // Inject dependencies into client
        container.injectDependencies(client);

        // Use the client
        client.doWork();
    }
}

