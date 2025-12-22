class NullTest {

    // method to generate NullPointerException
    static void makeError() {
        String text = null;
        System.out.println(text.length()); // error here
    }

    // method to handle NullPointerException
    static void handleError() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        try {
            makeError();
        } catch (Exception e) {
            System.out.println("Exception occurred in makeError()");
        }
        handleError();
    }
}