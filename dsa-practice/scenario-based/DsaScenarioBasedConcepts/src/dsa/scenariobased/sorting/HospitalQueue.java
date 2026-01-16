package dsa.scenariobased.sorting;

import java.util.Scanner;

//creating a class to sort patient arrival time using bubble sort
public class HospitalQueue {

	//performing bubble sort on arrival time of patients
	public static void bubbleSort(int[] patientArrivalTime) {
		boolean swapped;
		int size = patientArrivalTime.length;
		for(int i=0; i<size-1; i++) {
			swapped = false;
			for(int j=0; j<size-i-1; j++) {
				if(patientArrivalTime[j] > patientArrivalTime[j+1]) {
					//swapping						
					int temp = patientArrivalTime[j];
					patientArrivalTime[j] = patientArrivalTime[j+1];
					patientArrivalTime[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	//method to display results
	public static void printResults(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of patients : ");
		int size = sc.nextInt();
		
		
		int[] patientArrivalTime = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter arrival time for pateint " +(i+1) + " : ");
			patientArrivalTime[i] = sc.nextInt();
		}
		
		//displaying results
		System.out.println("\nPatient arrival time before sorting : ");
		printResults(patientArrivalTime);
		bubbleSort(patientArrivalTime);
		System.out.println("\nPatient arrival time after sorting : ");
		printResults(patientArrivalTime);
		
	}

}
