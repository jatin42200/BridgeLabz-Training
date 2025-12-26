
import java.util.Scanner;

public class NumberChecker3 {

    // Method to find the count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    //Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int temp = Math.abs(number);
        
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    //Method to reverse a digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    //Method to compare two arrays for equality
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    //Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    //Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        // We look for a 0 digit. In an integer array, leading zeros are already stripped.
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        // Step 1 & 2: Get digit count and store in array
        int[] originalDigits = getDigitsArray(input);
        
        // Step 3: Reverse the array
        int[] reversedDigits = reverseArray(originalDigits);

        // Displaying Results
        System.out.println("\n--- Results ---");
        System.out.print("Original Digits: ");
        printArray(originalDigits);

        System.out.print("Reversed Digits: ");
        printArray(reversedDigits);

        // Step 4: Use comparison logic
        System.out.println("Arrays are identical: " + areArraysEqual(originalDigits, reversedDigits));

        // Step 5: Palindrome Check
        System.out.println("Is Palindrome? " + isPalindrome(originalDigits));

        // Step 6: Duck Number Check
        System.out.println("Is Duck Number? " + isDuckNumber(originalDigits));
    }
}