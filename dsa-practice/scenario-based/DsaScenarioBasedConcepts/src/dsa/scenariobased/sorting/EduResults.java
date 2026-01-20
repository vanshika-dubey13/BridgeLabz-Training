package dsa.scenariobased.sorting;

public class EduResults {

    //class Student to hold attributes and constructor
    static class Student {
    	//attributes
        int rollNo;
        String name;
        int score;

        //constructor
        Student(int rollNo, String name, int score) {
            this.rollNo = rollNo;
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return rollNo + " | " + name + " | " + score;
        }
    }

    // method to perform Merge Sort
    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    
    //helper method for merge sort
    static void merge(Student[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].score >= R[j].score) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Main Method
    public static void main(String[] args) {

        // District-wise sorted data combined
        Student[] students = {
            new Student(201, "Amit", 88),
            new Student(202, "Riya", 92),
            new Student(203, "Kunal", 88),
            new Student(204, "Neha", 95),
            new Student(205, "Suresh", 90),
            new Student(206, "Anita", 92)
        };

        System.out.println("Before Sorting:");
        for (Student s : students)
            System.out.println(s);

        mergeSort(students, 0, students.length - 1);

        //displaying results
        System.out.println("\nFinal State-wise Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + ": " + s);
        }
    }
}
