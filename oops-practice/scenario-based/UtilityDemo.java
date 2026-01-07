import java.util.Scanner;

public class UtilityDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Java Utility Tools ===");
        
        // 1. Factorial check
        System.out.print("\n1. Enter a number for Factorial: ");
        int factNum = sc.nextInt();
        System.out.println("Result: " + factorial(factNum));

        // 2. Prime check
        System.out.print("\n2. Enter a number to check Prime: ");
        int pNum = sc.nextInt();
        System.out.println("Result: " + (isPrime(pNum) ? "It's a Prime Number" : "Not a Prime Number"));

        // 3. GCD check
        System.out.print("\n3. Enter two numbers for GCD (e.g., 25 15): ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Result: GCD is " + findGCD(n1, n2));

        // 4. Fibonacci check
        System.out.print("\n4. Enter N to find Nth Fibonacci number: ");
        int fibN = sc.nextInt();
        System.out.println("Result: " + fibN + "th Fibonacci is " + nthFibonacci(fibN));

        // 5. Positive/Negative check
        System.out.print("\n5. Enter any number for Sign Check: ");
        int sNum = sc.nextInt();
        numberCheck(sNum);

        System.out.println("\n==========================");
        sc.close();
    }

    // Factorial Logic (using long to handle big numbers)
    public static long factorial(int number) {
        if (number < 0) return -1; 
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Prime Logic (Optimized with Square Root)
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // GCD Logic (Using Euclidean Algorithm - Fast)
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fibonacci Logic (Iterative approach)
    public static int nthFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    // Sign Check Logic
    public static void numberCheck(int number) {
        if (number > 0) System.out.println("Result: Number is Positive (+)");
        else if (number < 0) System.out.println("Result: Number is Negative (-)");
        else System.out.println("Result: Number is Zero (0)");
    }
}