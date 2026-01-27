package com.collections.annotations.loggingmethodexecutiontime;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        SampleService service = new SampleServiceImpl();

        SampleService proxy = (SampleService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new ExecutionTimeHandler(service)
        );

        proxy.fastMethod();
        proxy.slowMethod();
    }
}

