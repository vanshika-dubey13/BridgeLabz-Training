//Creating a class  to find and return the length of a string without using the length() method

import java.util.Scanner;
public class LengthOfString{

	//Method to return string's length
	public static int lengthOfStr(String s){
	        int count = 0;
        	try {
            		for (;; count++) {   
                		s.charAt(count);
            		}
        	}
		catch (StringIndexOutOfBoundsException e) {
            	// Exception occurs when index goes out of range
            	return count;
        	}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        	String str = sc.next();

        	int customLength = lengthOfStr(str);
        	int builtInLength = str.length();

        	System.out.println("Length using user-defined method: " + customLength);
        	System.out.println("Length using built-in length() method: " + builtInLength);

        	sc.close();

	}
}
