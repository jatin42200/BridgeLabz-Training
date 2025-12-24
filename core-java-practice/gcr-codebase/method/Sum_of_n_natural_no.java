
import java.util.Scanner;

public class Sum_of_n_natural_no {

    // Method 1: Find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    //  Find sum of n natural no. using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input here
        int n = sc.nextInt();//here we enter a number

        // Check natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        // Calculate sums
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare both results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }
}
