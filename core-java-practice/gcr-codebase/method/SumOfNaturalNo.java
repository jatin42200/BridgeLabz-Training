

import java.util.Scanner;

public class SumOfNaturalNo{

    // Method to find sum of n natural numbers using loop
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int n = sc.nextInt();//enter natural no.

        // Calculate sum
        int result = findSum(n);

        // Display
        System.out.println("The sum of first " + n + " natural numbers is " + result);
    }
}
