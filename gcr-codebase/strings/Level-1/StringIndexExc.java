import java.util.Scanner;

class StringIndexExc {

    // method to generate exception
    static void makeError(String text) {
        System.out.println(text.charAt(text.length()));
    }

    // method to handle exception
    static void handleError(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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