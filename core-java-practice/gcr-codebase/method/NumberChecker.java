
import java.util.Scanner;

public class NumberChecker {

    // 1. Method to Find the count of digits in the number
    public static int countDigits(int numb) {
        if (numb == 0) return 1;
        int count = 0;
        int temp = Math.abs(numb); // Handle negative numbers
        while (temp > 0) {
            temp=temp/10;
            count++;
        }
        return count;
    }

    // 2. Method to Store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int temp = Math.abs(number);
        
        // Fill the array from right to left
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        return digits;
    }

    // 3. Method to Check if a number is a Duck Number
    // Definition: Contains at least one zero, but not at the start.
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    //  Method to check if the number is an Armstrong Number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        
        for (int digit : digits) {
        sum += Math.pow(digit, power);        }
        return sum == Math.abs(number);
    }

    // 5. Method to find Largest and Second Largest
    public static void findLargestAndSecond(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }

    //  Method to find Smallest and Second Smallest
    public static void findSmallestAndSecond(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }

    //here we create main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to analyze: ");
        int input = sc.nextInt();

        // Perform tasks
        int count = countDigits(input);
        int[] digitsArr = getDigitsArray(input);

        System.out.println("\n--- Results ---");
        System.out.println("Total Digits " + count);
        
        System.out.print("Digits in Array: ");
        for (int d : digitsArr) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digitsArr));
        System.out.println("Is Armstrong Number? " + isArmstrong(input, digitsArr));
        
        findLargestAndSecond(digitsArr);
        findSmallestAndSecond(digitsArr);
    }
}