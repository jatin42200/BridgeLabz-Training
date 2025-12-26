import java.util.Scanner;

public class NumberChecker4 {

    //  Method to check if a number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        // Check divisors from 2 up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //  Method to check if a number is a Neon Number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == num;
    }

    //  Method to check if a number is a Spy Number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    //  Method to check if a number is an Automorphic Number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String s1 = Integer.toString(num);
        String s2 = Integer.toString(square);
        
        // Check if the square string ends with the number string
        return s2.endsWith(s1);
    }

    //  Method to check if a number is a Buzz Number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int input = sc.nextInt();

        System.out.println("\n--- Mathematical Analysis ---");
        System.out.println("Is Prime?       : " + isPrime(input));
        System.out.println("Is Neon?        : " + isNeon(input));
        System.out.println("Is Spy?         : " + isSpy(input));
        System.out.println("Is Automorphic? : " + isAutomorphic(input));
        System.out.println("Is Buzz?        : " + isBuzz(input));
    }
}