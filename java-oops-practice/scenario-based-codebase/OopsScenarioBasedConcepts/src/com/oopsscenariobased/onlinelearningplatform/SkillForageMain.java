package com.oopsscenariobased.onlinelearningplatform;

import java.util.Scanner;

/* ================= MAIN APP ================= */
public class SkillForageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Instructor instructor = new Instructor("Rahul", 101);
        Student student = new Student("Amit", 201);

        Course course = null;

        int choice;
        do {
            System.out.println("\n===== SKILLFORGE MENU =====");
            System.out.println("1. Create Course (Default Modules)");
            System.out.println("2. Create Course (Custom Modules)");
            System.out.println("3. Display Course");
            System.out.println("4. Enroll Student");
            System.out.println("5. Track Progress");
            System.out.println("6. Generate Certificate");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter course title: ");
                    String title1 = sc.nextLine();
                    course = new Course(title1, instructor);
                    instructor.uploadCourse(course);
                    break;

                case 2:
                    System.out.print("Enter course title: ");
                    String title2 = sc.nextLine();
                    System.out.print("Enter number of modules: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    String[] mods = new String[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Module " + (i + 1) + ": ");
                        mods[i] = sc.nextLine();
                    }
                    course = new Course(title2, instructor, mods);
                    instructor.uploadCourse(course);
                    break;

                case 3:
                    if (course != null)
                        course.displayCourse();
                    else
                        System.out.println("No course created!");
                    break;

                case 4:
                    if (course != null)
                        student.enrollCourse(course);
                    else
                        System.out.println("Create a course first!");
                    break;

                case 5:
                    student.trackProgress();
                    student.calculateGrade();
                    break;

                case 6:
                    System.out.print("Enter course level (Beginner/Advanced): ");
                    String level = sc.nextLine();
                    student.generateCertificate(level);
                    break;

                case 7:
                    System.out.println("Thank you for using SkillForge!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
