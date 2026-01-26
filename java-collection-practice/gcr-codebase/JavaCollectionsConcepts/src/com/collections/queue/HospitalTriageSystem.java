package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalTriageSystem {

    // Patient class inside single class
    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PriorityQueue: higher severity treated first
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input patients
        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter severity (1-10): ");
            int severity = sc.nextInt();
            sc.nextLine();

            pq.add(new Patient(name, severity));
        }

        // Treat patients
        System.out.println("\n--- Treatment Order ---");
        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll());
        }

        sc.close();
    }
}

