package com.streamapi.foreachmethod;

import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Double> sensorReadings = List.of(
            22.5,
            35.2,
            18.9,
            40.1,
            28.7
        );

        double threshold = 30.0;

        sensorReadings.stream()
        // readings above threshold
            .filter(r -> r > threshold)
            .forEach(r ->
                System.out.println("High Sensor Reading: " + r)
            );
    }
}

