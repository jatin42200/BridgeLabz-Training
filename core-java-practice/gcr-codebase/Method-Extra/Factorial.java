
import java.util.Scanner;

public class Factorial {

    // Function to take input
    static int takeInput(Scanner sc) {
        return sc.nextInt();//here we enter a number
    }

    // Recursive function to calculate factorial
    static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    // Function to display result
    static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = takeInput(sc);

        long fact = factorial(num);

        displayResult(num, fact);
    }
}
