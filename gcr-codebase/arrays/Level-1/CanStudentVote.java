//Creating a class to take user input for the age of all 10 students in a class and check ing whether the student can vote depending on his/her age is greater or equal to 18.


import java.util.Scanner;
public class CanStudentVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int students[] = new int[10];
		System.out.println("Ente age of 10 students : ");
		//Storing the age values of 10 students through user input in array
		for(int i=0; i<10; i++){
			students[i] = sc.nextInt();
		}
		//Checking if student can vote or not
		for(int i=0; i<students.length; i++){
			if (students[i] < 0){
				System.out.println("Invalid age");
			} 
			else if (students[i] >= 18){
				System.out.println("The student with age " + students[i] +" can vote"); 		}
			else {
				System.out.println("The student with age " + students[i] +" cannot vote");
			} 
		}
		sc.close();

	}
}