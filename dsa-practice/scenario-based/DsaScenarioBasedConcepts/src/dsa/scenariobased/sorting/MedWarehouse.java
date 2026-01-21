package dsa.scenariobased.sorting;

import java.util.Scanner;

class Medicine {
	
	//attributes
    String name;
    int expiryDays; 

    //constructor
    Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }
}

public class MedWarehouse {

    // method to perform merge sort
    public static void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);
            merge(meds, left, mid, right);
        }
    }

    // helper method for merge sort
    public static void merge(Medicine[] meds, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = meds[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiryDays <= R[j].expiryDays) {
                meds[k++] = L[i++];
            } else {
                meds[k++] = R[j++];
            }
        }

        while (i < n1)
            meds[k++] = L[i++];

        while (j < n2)
            meds[k++] = R[j++];
    }

    // Display medicines
    public static void displayMedicines(Medicine[] meds) {
        System.out.println("\nMedicines sorted by expiry date:");
        for (Medicine m : meds) {
            System.out.println(
                "Medicine: " + m.name +
                ", Expires in: " + m.expiryDays + " days"
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of medicines: ");
        int n = sc.nextInt();
        Medicine[] meds = new Medicine[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\nEnter medicine name: ");
            String name = sc.nextLine();
            System.out.print("Enter expiry (days remaining): ");
            int expiry = sc.nextInt();
            meds[i] = new Medicine(name, expiry);
        }

        mergeSort(meds, 0, n - 1);
        displayMedicines(meds);

        sc.close();
    }
}
