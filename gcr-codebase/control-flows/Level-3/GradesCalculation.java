//creating a class to nput marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the guidelines

import java.util.Scanner;

public class GradesCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Physics : ");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks in Chemistry : ");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks in Maths : ");
        int marks3 = sc.nextInt();
        char grade;
	//Calculating average
	int average = ( marks1 + marks2 + marks ) / 3;

	if( average >= 80 ) {
		grade = 'A';
		System.out.println("Level 4, above agency-normalized standards");
	}
	else if( average >= 70 && average <= 79 ) {
		grade = 'B';
		System.out.println("Level 3, at agency-normalized standards");
	}
	else if( average >= 60 && average <= 69 ) {
		grade = 'C';
		System.out.println("Level 2, but approching agency-normalized standards");
	}
	else if( average >= 50 && average <= 59 ) {
		grade = 'D';
		System.out.println("Level 1, well below agency-normalized standards");
	}
	else if( average >= 40 && average <= 49 ) {
		grade = 'E';
		System.out.println("Level 1-, too below agency-normalized standards");
	}
	else {
		grade = 'R';
		System.out.println("Remedial standards");
	}
        
        sc.close();
    }
}