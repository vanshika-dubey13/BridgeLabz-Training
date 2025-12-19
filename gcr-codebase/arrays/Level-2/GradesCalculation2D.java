//creating a class to nput marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the guidelines

import java.util.Scanner;

public class GradesCalculation2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	//Taking number of students as user input
	System.out.println("Enter number of students :");
	int num = sc.nextInt();
	//Creating arrays to store marks-pcm, 
	int marks[][] = new int[num][3];
	double average[] =new double[num];
	char grade[] = new char[num];

	//Entering marks of students
	for( int i=0; i<num; i++){
		System.out.println("Enter marks of person : "+ (i+1));
		for( int j=0; j<3; j++){
		marks[i][j] = sc.nextInt();

		if(marks[i][j] <0){
			System.out.println("Enter valid marks");
			j--;
			}
		}
	}

	//Calculating averages of each students individually
	for( int i=0; i<num; i++){
		double total =0;
		for( int j=0; j<3; j++){
			total += marks[i][j];
		} average[i] = total/3.0;

	//Assigning grades
	if( average[i] >= 80 ) {
		grade[i] = 'A';
	}
	else if( average[i] >= 70 && average[i] <= 79 ) {
		grade[i] = 'B';
	}
	else if( average[i] >= 60 && average[i] <= 69 ) {
		grade[i] = 'C';
	}
	else if( average[i] >= 50 && average[i] <= 59 ) {
		grade[i] = 'D';	
	}
	else if( average[i] >= 40 && average[i] <= 49 ) {
		grade[i] = 'E';	
	}
	else {
		grade[i] = 'R';
	}
        
}
	for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + average[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
        sc.close();
    }
}