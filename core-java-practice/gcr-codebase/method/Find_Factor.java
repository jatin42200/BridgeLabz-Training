
import java.util.Scanner;

public class Find_Factor {
    //  Find factors and return array
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop--> count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;

        // here we store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // here we find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum =sum+factors[i];
        }

        return sum;
    }

    //here we find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product =product* factors[i];
        }

        return product;
    }

    // here we find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum =sum + Math.pow(factors[i], 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int number = sc.nextInt();//enter a number

        // call function that calculate factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();

        // Calculations
        int sum = findSum(factors);//call for sum
        long product = findProduct(factors);//call for product
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
