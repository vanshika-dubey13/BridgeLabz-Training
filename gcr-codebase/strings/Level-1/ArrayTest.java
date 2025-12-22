import java.util.Scanner;

class ArrayTest {

    // method to generate exception
    static void makeError(String[] names) {
        System.out.println(names[names.length]);
    }

    // method to handle exception
    static void handleError(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        try {
            makeError(names);
        } catch (Exception e) {
            System.out.println("Exception occurred in makeError()");
        }
        handleError(names);
    }
}