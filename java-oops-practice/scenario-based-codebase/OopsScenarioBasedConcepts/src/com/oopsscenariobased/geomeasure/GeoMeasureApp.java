package com.oopsscenariobased.geomeasure;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeoMeasureApp{
	
	//method to compare line segments
	public static void compareLines(LineSegment line1, LineSegment line2) {
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.printf("Length of Line 1: %.2f%n", length1);
        System.out.printf("Length of Line 2: %.2f%n", length2);

        if (length1 == length2) {
            System.out.println("Both lines are of equal length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
        System.out.println("-----------------------------------");
    }
	
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LineSegment[]> comparisons = new ArrayList<>();
        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);
            System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
            LineSegment line1 = new LineSegment(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );
            System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
            LineSegment line2 = new LineSegment(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            comparisons.add(new LineSegment[]{line1, line2});
        }

        //displaying results
        System.out.println("\n--- Line Comparison Results ---");
        for (LineSegment[] pair : comparisons) {
            compareLines(pair[0], pair[1]);
        }

        sc.close();
    }
}
