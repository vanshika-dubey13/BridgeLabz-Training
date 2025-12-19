//creating a class to nput marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the guidelines

import java.util.Scanner;

public class GradesCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	//Taking number of students as user input
	System.out.println("Enter number of students :");
	int num = sc.nextInt();
	//Creating arrays to store marks-pcm, percentage and grades of student
	int []physics = new int[num];
	int []chemistry = new int[num];
	int []maths = new int[num];
	double []average = new double[num];
	String grade[] = new String[num];

	//Entering marks of students
	for( int i=0; i<num; i++){
		System.out.println("Enter marks of person : "+ (i+1));
		System.out.print("Enter marks in Physics : ");
		physics[i] = sc.nextInt();
		System.out.print("Enter marks in Chemistry : ");
		chemistry[i] = sc.nextInt();
        	System.out.print("Enter marks in Maths : ");
		maths[i] = sc.nextInt();

	}

	//Calculating averages of each students individually
	for( int i=0; i<num; i++){
		average[i] = (double) (physics[i] + chemistry[i] + maths[i])/3 ;
	}

	//Assigning grades
	for(int i=0; i<num; i++){
	if( average[i] >= 80 ) {
		grade[i] = "A";
	}
	else if( average[i] >= 70 && average[i] <= 79 ) {
		grade[i] = "B";
	}
	else if( average[i] >= 60 && average[i] <= 69 ) {
		grade[i] = "C";
	}
	else if( average[i] >= 50 && average[i] <= 59 ) {
		grade[i] = "D";	
	}
	else if( average[i] >= 40 && average[i] <= 49 ) {
		grade[i] = "E";	
	}
	else {
		grade[i] = "R";
	}
        
}
		for(int i=0; i<num; i++){
			System.out.println("Grades of student " + (i+1) + " is " + grade[i]);
	}
        sc.close();
    }
}