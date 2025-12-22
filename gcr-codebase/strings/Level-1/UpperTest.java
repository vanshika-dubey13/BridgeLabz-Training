import java.util.Scanner;

class UpperTest {

    // method to convert text to uppercase using charAt()
    static String makeUpper(String text) {
        String res = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // convert to uppercase
            }

            res = res + ch;
        }

        return res;
    }

    // method to compare two strings using charAt()
    static boolean checkSame(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String up1 = makeUpper(text);
        String up2 = text.toUpperCase();

        System.out.println("Uppercase using charAt(): " + up1);
        System.out.println("Uppercase using toUpperCase(): " + up2);
        boolean result = checkSame(up1, up2);

        if (result) {
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Both results are DIFFERENT");
        }
    }
}