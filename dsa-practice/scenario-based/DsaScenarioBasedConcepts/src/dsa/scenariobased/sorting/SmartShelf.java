package dsa.scenariobased.sorting;

import java.util.ArrayList;
import java.util.Scanner;

//creating a class to sort books alphabetically using insertion sort
public class SmartShelf {

	//method to perform insertion sort on titles
	public static ArrayList<String>insertionSort(ArrayList<String> a) {
		for (int i = 1; i < a.size(); i++) {
			String s = a.get(i);
			int j = i - 1;
			while (j >= 0 && s.compareTo(a.get(j)) < 0) {
			    String y = a.get(j + 1);
			    a.set(j + 1, a.get(j));
			    a.set(j, y);
			    j--;
			}

			String y = a.get(j + 1);
			y = s;
		}
		return a;
	}

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking title of books through user input
		System.out.println("Enter number of books : ");
		int size = sc.nextInt();
		ArrayList<String> titles = new ArrayList<String>();
		for(int i=0; i<size; i++) {
			System.out.println("Enter title of book " +(i+1));
			String s = sc.next();
			titles.add(s);
		}
		
		//displaying results
		System.out.println("\nTitles before sorting :");
		System.out.println(titles);
		insertionSort(titles);
		System.out.println("\nTitles after sorting :");
		System.out.println(titles);
	}

}
