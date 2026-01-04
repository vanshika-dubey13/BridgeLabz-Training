package com.dsa.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Scanner;

//main class
public class TaskSchedulerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskSchedulerOperations scheduler = new TaskSchedulerOperations();
        int choice = -1;

        //displaying menu
        do {
            System.out.println("\n1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task");
            System.out.println("6. Move to Next Task");
            System.out.println("7. Display All Tasks");
            System.out.println("8. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter TaskID Name Priority DueDate: ");
                    scheduler.addTaskBeginning(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter TaskID Name Priority DueDate: ");
                    scheduler.addTaskEnd(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter TaskID Name Priority DueDate Position: ");
                    scheduler.addTaskAtPosition(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter TaskID to remove: ");
                    scheduler.removeTask(sc.next());
                    break;
                case 5:
                    scheduler.viewCurrentTask();
                    break;
                case 6:
                    scheduler.moveToNextTask();
                    break;
                case 7:
                    scheduler.displayAllTasks();
                    break;
                case 8:
                    System.out.print("Enter Priority to search: ");
                    scheduler.searchByPriority(sc.nextInt());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
