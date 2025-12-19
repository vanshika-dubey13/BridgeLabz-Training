//Creating a class to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less


import java.util.Scanner;
public class NumberChecking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		//Storing 5 numbers in array through user input
		for(int i=0; i<nums.length; i++){
			System.out.println("Enter number " + (i + 1) + " : ");
			nums[i] = sc.nextInt();
		}
		
		//Checking if number is +ve, -ve, 0
		for(int i=0; i<nums.length; i++){
			if (nums[i] > 0){
				if(nums[i] %2 ==0){
					System.out.println( nums[i] +" is positive and even");					}
				else{
					System.out.println( nums[i] +" is positive and odd");					}
		}

			else if (nums[i] < 0){
				System.out.println(nums[i] +" is negative "); 				}
			else {
				System.out.println(nums[i] +" is zero");
			} 
		}
		//Comparing 1st and last element of arr
			if(nums[0] == nums[nums.length -1]){	
				System.out.println("First and last element is equal");
				}
			else if(nums[0] > nums[nums.length -1]){	
				System.out.println("First element is greater than last element");			}
			else{
				System.out.println("Last element is greater than first element");			}

				

	sc.close();
	}
}