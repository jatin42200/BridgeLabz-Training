import java.util.Scanner;

public class NumberChecker2 {

    // Method to find the count of digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to Store the digits in an array
    public static int[] getDigitsArray(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int temp = Math.abs(number);

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        return digits;
    }

    // Method to find the sum of digits using the array
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum = sum + d;
        return sum;
    }

    // Method to find the sum of squares using Math.pow()
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum = sum + (int) Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if it is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumDigits(digits);
        if (sum == 0) return false; 
        return Math.abs(number) % sum == 0;
    }

    // Method to find frequency of each digit using a 2D array
    public static int[][] getFrequencyArray(int[] digits) {
        // Count occurrences of digits 0-9
        int[] counts = new int[10];
        for (int d : digits) {
            counts[d]++;
        }

        // Determine how many unique digits exist to size the 2D array
        int uniqueCount = 0;
        for (int c : counts) {
            if (c > 0) uniqueCount++;
        }

        // Store result: [digit][frequency]
        int[][] freqMap = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                freqMap[index][0] = i;      // Digit
                freqMap[index][1] = counts[i]; // Frequency
                index++;
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Data preparation
        int[] digits = getDigitsArray(num);
        
        // Display Results
        System.out.println("\n--- results for " + num + " ---");
        System.out.println("Digit Count " + countDigits(num));
        System.out.println("Sum of Digits " + sumDigits(digits));
        System.out.println("Sum of Squares " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + (isHarshad(num, digits) ? "Yes" : "No"));

        System.out.println("\nDigit Frequency (2D Array):");
        int[][] freq = getFrequencyArray(digits);
        System.out.println("Digit | Frequency");
        System.out.println("---------------");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("  " + freq[i][0] + "   |    " + freq[i][1]);
        }
    }
}