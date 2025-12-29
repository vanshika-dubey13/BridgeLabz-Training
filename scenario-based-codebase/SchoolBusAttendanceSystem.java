//Creating a class to display present/absent student's data 

import java.util.Scanner;

public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //defining an array to store student's names
        String[] studentsName = {
                "Anil", "Bhavana", "Chitra", "David", "Elina", "Firoza", "Inayat", "Jayant", "Kashish", "Meena"
        };

        //storing counts of present and absent students
        int presentCount = 0;
        int absentCount = 0;
        for (String student : studentsName) {
            //marking attendance of student using user input
            System.out.print(student + " - Present or Absent? (P/A): ");
            char status = sc.next().charAt(0);

            //updating attendance status
            if (status == 'P' || status == 'p') {
                presentCount++;
            } else if (status == 'A' || status == 'a') {
                absentCount++;
            } else {
                System.out.println("Invalid input! Marked as Absent.");
                absentCount++;
            }
        }

        //displaying attendance details 
        System.out.println("\nTotal present : " + presentCount);
        System.out.println("Total absent : " + absentCount);
    }
}