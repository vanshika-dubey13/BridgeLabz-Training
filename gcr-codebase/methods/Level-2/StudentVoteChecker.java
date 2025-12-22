//Creating a class to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.


import java.util.Scanner;
public class StudentVoteChecker{

	public static boolean canStudentVote(int age){
		if (age < 0){
			return false;
		}
		return age>=18;
	}

	public static void main(String[] args){ 
	
	//Taking 3 numbers from user 
	Scanner sc = new Scanner(System.in);
	int age[] = new int[10];
	//Enter ages
	for(int i=0; i<10; i++){ 
		System.out.print("Enter age of " + (i+1) + "person : ");
		age[i] = sc.nextInt();
	}
	//Checking if the person can vote
	for(int i=0; i<10; i++){ 
		if( canStudentVote(age[i])){
			System.out.println("Person " + (i + 1) + " can vote.");
		}
		else{
			System.out.println("Person " + (i + 1) + " cannot vote.");
		}
           }
		sc.close();
	}
}