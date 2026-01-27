package com.collections.annotations.cacheresult;

import java.lang.annotation.*;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        MathService service = new MathServiceImpl();

        MathService proxy = (MathService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new CacheHandler(service)
        );

        System.out.println(proxy.slowSquare(4)); // slow
        System.out.println(proxy.slowSquare(4)); // cached
        System.out.println(proxy.slowSquare(5)); // slow
        System.out.println(proxy.slowSquare(4)); // cached
    }
}


