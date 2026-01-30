package com.functionalinterfaces;

import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double threshold = 38.0; 

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemp =
                temp -> temp > threshold;

        double currentTemp = 39.2;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert: High Temperature!");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}

