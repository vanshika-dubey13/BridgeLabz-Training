package com.collections.annotations.loggingmethodexecutiontime;

public class SampleServiceImpl implements SampleService {

    @LogExecutionTime
    @Override
    public void fastMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // simulate work
        }
    }

    @LogExecutionTime
    @Override
    public void slowMethod() {
        try {
            Thread.sleep(500); // simulate slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

