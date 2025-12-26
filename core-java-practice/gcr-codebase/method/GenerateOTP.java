
import java.util.Scanner;

public class GenerateOTP {

    // 1. Method to generate a 6-digit OTP using Math.random()
    // Range: 100000 to 999999
    public static int generateOTP() {
        // Formula: (Math.random() * (max - min + 1)) + min
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    // 2. Method to ensure the generated OTPs in the array are unique
    // Compares every element with every other element
    public static boolean areOTPsUnique(int[] otpList) {
        for (int i = 0; i < otpList.length; i++) {
            for (int j = i + 1; j < otpList.length; j++) {
                // If any two elements are the same, they are not unique
                if (otpList[i] == otpList[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Array to save 10 generated OTP numbers
        int[] storage = new int[10];

        System.out.println("--- Generating 10 OTPs ---");
        
        // Populate the array with 10 random OTPs
        for (int i = 0; i < storage.length; i++) {
            storage[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + storage[i]);
        }

        // Validate uniqueness
        boolean uniqueResult = areOTPsUnique(storage);

        System.out.println("\n--- Validation Results ---");
        if (uniqueResult) {
            System.out.println("Success: All 10 OTPs generated are unique.");
        } else {
            System.out.println("Warning: Duplicate OTPs were detected in the batch.");
        }
    }
}