//Creating a class SamAverageMarks to calculate Sam's average marks

public class SamAverageMarks {
    public static void main(String[] args) {
        
	//Marks of Sam
	int maths = 94, physics = 95, chemistry = 96;

	//Calculating Sam's average marks
        double average = (double) ( maths + physics + chemistry ) / 3;

	//Displaying Sam's average marks
        System.out.println("The average of Sam in PCM is : " + average);
    }
}