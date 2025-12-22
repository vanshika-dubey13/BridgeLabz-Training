import java.util.Scanner;

class LowerTest {

    // method to convert text to lowercase using charAt()
    static String makeLower(String text) {
        String res = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // convert to lowercase
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
        String low1 = makeLower(text);
        String low2 = text.toLowerCase();

        System.out.println("Lowercase using charAt(): " + low1);
        System.out.println("Lowercase using toLowerCase(): " + low2);
        boolean result = checkSame(low1, low2);

        if (result) {
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Both results are DIFFERENT");
        }

    }
}