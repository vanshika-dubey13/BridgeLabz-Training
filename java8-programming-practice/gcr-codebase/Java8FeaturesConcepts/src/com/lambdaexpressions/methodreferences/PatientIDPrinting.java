package com.lambdaexpressions.methodreferences;

import java.util.*;

public class PatientIDPrinting {

    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        // Using method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}

