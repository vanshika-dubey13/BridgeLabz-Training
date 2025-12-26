import java.util.Scanner;

public class RajResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating array to store marks in 5 subjects
        int[] marks = new int[5];
        int total = 0;

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculating average
        int avg = total / 5;
        System.out.println("Average Marks: " + avg);

        // Assigning grade using switch
        switch (avg / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        sc.close();
    }
}
