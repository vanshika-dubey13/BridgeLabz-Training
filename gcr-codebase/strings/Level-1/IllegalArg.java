import java.util.Scanner;

class IllegalArg {

    // method to generate exception
    static void makeError(String text) {
        int s = 5;
        int e = 2;

        // start index is greater than end index
        if (s > e) {
            throw new IllegalArgumentException("S is greater than e");
        }

        System.out.println(text.substring(s, e));
    }

    // method to handle exception
    static void handleError(String text) {
        int s = 5;
        int e = 2;

        try {
            if (s > e) {
                throw new IllegalArgumentException("S  is greater than e");
            }
            System.out.println(text.substring(s, e));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();
        try {
            makeError(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in makeError()");
        }
        handleError(text);
    }
}