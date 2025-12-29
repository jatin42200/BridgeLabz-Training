
import java.util.Scanner;

public class checkPrime{

    // Function to check prime number
    static boolean isPrime(int number) {

        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Check prime no by for loop..............
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;   //if number give 0 reminder than it is not prime number 
            }
        }

        return true; // if number if condition me nahi jaayega iska matlab hai number prime number hai
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we enter a number

        boolean result = isPrime(num);

        if (result) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }
    }
}
