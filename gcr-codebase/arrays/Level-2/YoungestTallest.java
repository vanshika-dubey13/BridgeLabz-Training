//Creating a class to  find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
public class YoungestTallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int []ages = new int[3];
		int []heights = new int[3];
		String []friends = {"Amar", "Akbar", "Anthony"};
		//Taking age and height of each friend as input
		for( int i=0; i<3; i++ ){
			System.out.println("Enter the values for friend " + (i+1));
			System.out.println("Enter age : ");
			ages[i] = sc.nextInt();
			System.out.println("Enter height : ");
			heights[i] = sc.nextInt();
		}
		int tallest = heights[0];
		int youngest = ages[0];
		String tallestName = friends[0];
		String youngestName = friends[0];
		//Finding the tallest and youngest 
		for( int i=1; i<3; i++ ){
			if(ages[i] < youngest ){
				youngest = ages[i];
				youngestName = friends[i];
			}
			if(heights[i] > tallest ){
				tallest = heights[i];
				tallestName = friends[i];
			}

		}

		//Displaying tallest and youngest friend
		
		System.out.println("Tallest is : " + tallestName);
		System.out.println("Youngest is : " + youngestName);
	sc.close();

	}
}