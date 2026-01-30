package com.interfaces.staticmethods;

interface UnitConverter {

    // static method to convert kilometers to miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // static method to convert kilograms to pounds
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class UnitConversion {

    public static void main(String[] args) {

        double distanceKm = 100;
        double weightKg = 50;

        double distanceMiles = UnitConverter.kmToMiles(distanceKm);
        double weightLbs = UnitConverter.kgToLbs(weightKg);

        System.out.println(distanceKm + " km = " + distanceMiles + " miles");
        System.out.println(weightKg + " kg = " + weightLbs + " lbs");
    }
}

