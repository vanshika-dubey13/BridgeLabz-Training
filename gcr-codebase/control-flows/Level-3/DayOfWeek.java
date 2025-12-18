//Creating a class to hat takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. 

public class DayOfWeek {
    public static void main(String[] args) {
        // Parsing command-line arguments
	// month
        int m = Integer.parseInt(args[0]); 
	// day
        int d = Integer.parseInt(args[1]); 
	// year
        int y = Integer.parseInt(args[2]); 

        // Applying the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Displaying the result by storing values of days in an array
	String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week : " + days[d0]);

    }
}