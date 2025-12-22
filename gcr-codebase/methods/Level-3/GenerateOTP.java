import java.util.HashSet;
import java.util.Set;

public class GenerateOTP {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean isOTPUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
	//Hashset wil store only unique values
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }

        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Validating uniqueness
        if (isOTPUnique(otpArray)) {
            System.out.println("\nAll generated OTPs are unique.");
        } else {
            System.out.println("\nDuplicate OTPs found.");
        }
    }
}
