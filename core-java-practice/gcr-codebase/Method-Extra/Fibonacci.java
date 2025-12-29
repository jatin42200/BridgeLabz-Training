
import java.util.Scanner;

public class Fibonacci{

    // Function to generate and print Fibonacci sequence
    static void printFibonacci(int terms) {

        int first = 0;
        int second = 1;

        // Handle edge case
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        System.out.print("Fibonacci Sequence is: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}
