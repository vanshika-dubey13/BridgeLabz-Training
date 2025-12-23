import java.util.Scanner;

public class UniqueCharacters {

	// Method to find length of string
    	public static int findLength(String s) {
        	int count = 0;
        	try {
            		while (true) {
                	s.charAt(count);
                	count++;
            		}
        	}
		catch (Exception e) {
            	// Exception occurs when index goes out of bounds
        	}
        	return count;
    	}

	// Method to find unique characters using charAt()
    	public static char[] findingUniqueCharacters(String s) {
        	int length = findLength(s);
        	char[] temp = new char[length];
        	int uniqueCount = 0;
        	// Outer loop for each character
        	for (int i = 0; i < length; i++) {
            		char currentChar = s.charAt(i);
            		boolean isUnique = true;
			// Inner loop to check previous characters
            		for (int j = 0; j < i; j++) {
                		if (currentChar == s.charAt(j)) {
                    			isUnique = false;
                    			break;
                		}
            		}

            	// Storing unique character
            	if (isUnique) {
                	temp[uniqueCount] = currentChar;
                	uniqueCount++;
            	}
        }

	// Creat new array with exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
		result[i] = temp[i];
        }

        return result;
    }


	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String input = sc.nextLine();
        	char[] uniqueChars = findingUniqueCharacters(input);

		//Displaying unique characters in string 
        	System.out.println("Unique characters in the string:");
        	for (char c : uniqueChars) {
            		System.out.print(c + " ");
        	}

        	sc.close();
    	}
}
