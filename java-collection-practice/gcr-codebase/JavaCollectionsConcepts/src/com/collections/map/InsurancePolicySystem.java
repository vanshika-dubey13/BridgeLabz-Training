package com.collections.map;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    static class Policy {
    	//attributes
        String policyNumber;
        String policyholderName;
        LocalDate expiryDate;
        String coverageType;
        double premiumAmount;

        //constructor
        Policy(String policyNumber, String policyholderName,
               LocalDate expiryDate, String coverageType, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        //overriding method to display policy details
        @Override
        public String toString() {
            return policyNumber + " | " + policyholderName + " | " +
                   expiryDate + " | " + coverageType + " | $" + premiumAmount;
        }
    }

    //main method
    public static void main(String[] args) {

        // 1Storing policies in different maps
        Map<String, Policy> hashMap = new HashMap<>(); // quick lookup
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>(); // insertion order
        TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>(); // sorted by expiry date

        // Sample policies
        Policy poilcy1 = new Policy("P1001", "Alice", LocalDate.now().plusDays(10), "Health", 500);
        Policy poilcy2 = new Policy("P1002", "Bob", LocalDate.now().plusDays(35), "Auto", 800);
        Policy poilcy3 = new Policy("P1003", "Alice", LocalDate.now().plusDays(5), "Home", 1200);
        Policy poilcy4 = new Policy("P1004", "Charlie", LocalDate.now().minusDays(2), "Health", 450); // expired

        List<Policy> policies = Arrays.asList(poilcy1, poilcy2, poilcy3, poilcy4);

        for (Policy p : policies) {
            hashMap.put(p.policyNumber, p);
            linkedHashMap.put(p.policyNumber, p);
            treeMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
        }

        // Retrieving a policy by number
        System.out.println("Retrieve P1002: " + hashMap.get("P1002"));

        // Policies expiring in next 30 days
        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate next30 = today.plusDays(30);
        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.subMap(today, true, next30, true).entrySet()) {
            entry.getValue().forEach(System.out::println);
        }

        // Policies for a specific policy holder
        System.out.println("\nPolicies for Alice:");
        linkedHashMap.values().stream()
                .filter(p -> p.policyholderName.equals("Alice"))
                .forEach(System.out::println);

        // Removing expired policies
        System.out.println("\nRemoving expired policies...");
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        linkedHashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        treeMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));

        System.out.println("\nRemaining policies in HashMap:");
        hashMap.values().forEach(System.out::println);
    }
}
