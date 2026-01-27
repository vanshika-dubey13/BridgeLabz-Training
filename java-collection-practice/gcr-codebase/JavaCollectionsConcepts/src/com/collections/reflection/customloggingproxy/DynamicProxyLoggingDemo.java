package com.collections.reflection.customloggingproxy;

import java.lang.reflect.*;

public class DynamicProxyLoggingDemo {

 public static void main(String[] args) {

     // Original object
     Greeting greeting = new GreetingImpl();
     // Creating proxy
     Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
    		 // ClassLoader
            greeting.getClass().getClassLoader(),      
            // Interfaces to implement
            new Class[]{Greeting.class},              
            // InvocationHandler
            new LoggingInvocationHandler(greeting)    
    		 );

     // Calling methods via proxy
     proxyInstance.sayHello("Alice");
     proxyInstance.sayGoodbye("Bob");
 }
}

