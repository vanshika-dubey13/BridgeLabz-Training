package com.dsa.linkedlist.circularlinkedlist.roundrobinscheduling;

import java.util.Scanner;

public class SchedulerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchedulerOperations scheduler = new SchedulerOperations();

        int choice;

        //displaying menu
        do {
            System.out.println("\n--- Round Robin Scheduler ---");
            System.out.println("1. Add Process");
            System.out.println("2. Display Processes");
            System.out.println("3. Run Round Robin Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int bt = sc.nextInt();
                    scheduler.addProcess(pid, bt);
                    break;

                case 2:
                    scheduler.display();
                    break;

                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int tq = sc.nextInt();
                    scheduler.roundRobin(tq);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
