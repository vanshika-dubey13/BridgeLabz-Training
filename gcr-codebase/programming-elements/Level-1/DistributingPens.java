//Creating a class to calculate number of distributed and un-distributes pens

public class DistributingPens{
	public static void main(String[] args){

	//Creating variables to store total pens and students
	int totalPens = 14;
	int totalStudents = 3;
	
	//Calculated total distributed pens and non-distributed pens
	int distributed = totalPens / totalStudents;
	int nonDistributed = totalPens - distributed * 3;

	//Displaying total number of distributed and non-distributed pens
	System.out.println("The Pen Per Student is " + distributed +" and the remaining pen not distributed is " + nonDistributed );
	sc.close();
	}
}