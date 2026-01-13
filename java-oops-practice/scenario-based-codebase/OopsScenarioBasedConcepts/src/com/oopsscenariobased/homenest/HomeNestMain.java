package com.oopsscenariobased.homenest;

import java.util.*;

public class HomeNestMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Device> devices = new ArrayList<>();

    //main method
    public static void main(String[] args) {

        int choice;
        //displaying menu
        do {
            System.out.println("\n===== HomeNest Smart Home =====");
            System.out.println("1. Register Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Reset Device");
            System.out.println("5. Calculate Energy Usage");
            System.out.println("6. Show Device Status");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerDevice();
                case 2 -> controlDevice(true);
                case 3 -> controlDevice(false);
                case 4 -> resetDevice();
                case 5 -> calculateEnergy();
                case 6 -> showStatus();
                case 0 -> System.out.println("HomeNest system shut down.");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    //method to register a device
    public static void registerDevice() {
        System.out.println("Select Device Type:");
        System.out.println("1. Light\n2. Camera\n3. Thermostat\n4. Lock");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();

        System.out.print("Enter energy usage per hour: ");
        double usage = sc.nextDouble();

        Device d = switch (type) {
            case 1 -> new Light(id, usage);
            case 2 -> new Camera(id, usage);
            case 3 -> new Thermostat(id, usage);
            case 4 -> new Lock(id, usage);
            default -> null;
        };

        if (d != null) {
            devices.add(d);
            System.out.println("Device registered successfully.");
        }
    }

    //method to get device by id
    public static Device getDeviceById(String id) {
        for (Device d : devices)
            if (d.getDeviceId().equals(id))
                return d;
        return null;
    }

    //method to control device
    public static void controlDevice(boolean on) {
        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();
        Device d = getDeviceById(id);

        if (d != null) {
            if (on) d.turnOn();
            else d.turnOff();
        } else {
            System.out.println("Device not found.");
        }
    }

    //method to reset device
    public static void resetDevice() {
        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();
        Device d = getDeviceById(id);

        if (d != null) d.reset();
        else System.out.println("Device not found.");
    }

    //method to calculate energy usage
    public static void calculateEnergy() {
        System.out.print("Enter Device ID: ");
        String id = sc.nextLine();
        Device d = getDeviceById(id);

        if (d != null) {
            System.out.print("Enter hours used per day: ");
            int hrs = sc.nextInt();
            System.out.println("Monthly Energy Usage: " +
                    d.calculateMonthlyEnergy(hrs) + " units");
        }
    }

    //method to display device details 
    public static void showStatus() {
        for (Device d : devices) {
            System.out.println(d.getDeviceId() +
                    " | Status: " + (d.getStatus() ? "ON" : "OFF"));
        }
    }
}
