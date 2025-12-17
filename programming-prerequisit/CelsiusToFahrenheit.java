import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature in celsius :");
	int celsius = sc.nextInt();
	int fahrenheit = (celsius * 9/5) + 32;
	System.out.println(fahrenheit);
	}
}
	