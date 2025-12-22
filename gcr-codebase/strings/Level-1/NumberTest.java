import java.util.Scanner;

class NumberTest {

    // method to generate exception
    static void makeError(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    // method to handle exception
    static void handleError(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        String text = sc.next();
        try {
            makeError(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in makeError()");
        }
        handleError(text);
    }
}