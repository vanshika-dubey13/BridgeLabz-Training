import java.util.Scanner;

class CharArrayTest {

    // method to get characters without using toCharArray()
    static char[] getChars(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    // method to compare two char arrays
    static boolean checkSame(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();
        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.print("Characters using user method: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Characters using toCharArray(): ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        boolean result = checkSame(arr1, arr2);
        if (result) {
            System.out.println("Both character arrays are same");
        } else {
            System.out.println("Both character arrays are different");
        }
    }
}