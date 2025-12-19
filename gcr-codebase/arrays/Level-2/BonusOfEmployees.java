// Creating a class to find the bonus of employees based on their years of service.

import java.util.Scanner;
public class BonusOfEmployees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating arrays to store data
        double salary[] = new double[10];
	double yearOfService[] = new double[10];
	double newSalary[] = new double[10];
	double bonus[] = new double[10];

	
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking arrays as user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details of Employee " + (i + 1));
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            yearOfServices[i] = sc.nextDouble();
            if (salary[i] <= 0 || yearOfService[i] < 0) {
                System.out.println("Invalid input, Enter valid values.");
                i--; // decrementing index 
                continue;
            }
        }
	//Calculating bonus
        for (int i = 0; i < 10; i++) {
            if (yearOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
	//Calculating new salary
            newSalary[i] = salary[i] + bonus[i];
            totalBonus = totalBonus + bonus[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Displaying Old salary, new salary and bonus
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
