
import java.util.Scanner;

public class Number_checker {

    // Method to check positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();//here we enter a number
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last element:");

        if (result == 1) {
            System.out.println("First element is Greater than last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to last element");
        } else {
            System.out.println("First element is Less than last element");
        }
    }
}
