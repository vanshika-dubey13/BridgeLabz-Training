//Creating a class to find the smallest and the largest of the 3 numbers using a method


import java.util.Scanner;

public class SmallestAndLargest {
	
	public static int[] findSmallestAndLargest(int num1, int num2, int num3){
		// Checking  which number is the largest
		int largest=0, smallest=0;
		int ans []= new int[2];
        	if((num1 >= num2) && (num1 >= num3)){
			largest = num1;
		}
        	else if((num2 >= num1) && (num2 >= num3)){
			largest = num2;
		}
		else {
			largest = num3;
		}

		// Checking  which number is the smallest
        	if((num1 <= num2) && (num1 <= num3)){
			smallest = num1;
		}
        	else if((num2 <= num1) && (num2 <= num3)){
			smallest = num2;
		}
		else {
			smallest = num3;
		}

		//Storing largest and smallest in array
		ans [0]=  largest;
		ans [1] = smallest;
		return ans;	
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        
        // Output results
        //findSmallestAndLarges( num1, num2, num3);
	int ans[]  = findSmallestAndLargest( num1, num2, num3);
	//Displaying result in form of arr
	System.out.println("Largest is : " + ans[0]);
	System.out.println("Smallest is : " + ans[1]);
        sc.close();
    }
}
