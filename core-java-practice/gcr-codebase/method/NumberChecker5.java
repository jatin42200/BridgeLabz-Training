
import java.util.Scanner;

public class NumberChecker5 {

    // Helper method to find the sum of proper divisors
    public static int getSumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Method to check if a number is a Perfect Number
    public static boolean isPerfect(int num) {
        if (num <= 0) return false;
        return getSumOfDivisors(num) == num;
    }

    //Method to check if a number is an Abundant Number
    public static boolean isAbundant(int num) {
        if (num <= 0) return false;
        return getSumOfDivisors(num) > num;
    }

    //Method to check if a number is a Deficient Number
    public static boolean isDeficient(int num) {
        if (num <= 0) return false;
        return getSumOfDivisors(num) < num;
    }

    // Helper method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //Method to check if a number is a Strong Number
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int input = sc.nextInt();

        System.out.println("\n--- Divisor & Factorial Analysis ---");
        
        // Displaying results for Perfect, Abundant, and Deficient
        if (isPerfect(input)) {
            System.out.println(input + " is a Perfect Number.");
        } else if (isAbundant(input)) {
            System.out.println(input + " is an Abundant Number.");
        } else {
            System.out.println(input + " is a Deficient Number.");
        }

        // Displaying result for Strong Number
        System.out.println("Is Strong Number? : " + (isStrong(input) ? "Yes" : "No"));
    }
}