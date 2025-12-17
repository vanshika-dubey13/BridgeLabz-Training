import java.util.Scanner;
public class VolOfCylinder{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of cylinder :");
	float radius = sc.nextFloat();
	System.out.println("Enter height of cylinder :");
	int height = sc.nextInt();
	double area = 3.14 * radius * radius * height;
	System.out.println(area);
	}
}
	