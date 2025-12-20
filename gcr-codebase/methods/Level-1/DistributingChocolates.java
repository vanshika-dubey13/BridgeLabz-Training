//Creating a class to calculate number of distributed and un-distributes chocolates
import java.util.Scanner;
public class DistributingChocolates{

	public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren) 
	{
		int ans []= new int[2];
        	//Calculating quotient and remainder
		int distributed = (numberOfchocolates / numberOfChildren) * numberOfChildren;
		int nonDistributed = numberOfchocolates % numberOfChildren;

		//Storing quotient and remainder in array
		ans [0]=  distributed;
		ans [1] = nonDistributed;
		return ans;	
	}

	public static void main(String[] args){

	//Creating variables to store total pens and students
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of chocolates : ");
	int numberOfchocolates  = sc.nextInt();
	System.out.println("Enter number of students : ");

	int numberOfChildren = sc.nextInt();
	
	
	//Displaying total number of distributed and non-distributed chocolates
	int ans[]  = findRemainderAndQuotient( numberOfchocolates, numberOfChildren );

	System.out.println("The distributed chocolates are " + ans [0] +" and the remaining are " + ans [1] );
	sc.close();
	}
}