//Creating a class to calculate volume of earth in miles and km

public class VolumeOfEarth{
	public static void main(String[] args){
	//Creating variable to store radius of Earth
	int radius = 6378;
	
	//Converting volume into km and miles
	double volInKm = (double)(4 * 3.14 * radius * radius *radius ) / 3 ;
	double volInMiles = volInKm * 1.6;
	
	//Displaying result
	System.out.println("The volume of earth in cubic kilometers is " +  volInKm +" and cubic miles is " + volInMiles);
	}
}