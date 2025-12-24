
import java.util.Scanner;

public class Quo_And_Rem {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quo = number / divisor;
        int rem = number % divisor;

        return new int[]{quo, rem};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //here we take divisor and dividend

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);
    }
}
