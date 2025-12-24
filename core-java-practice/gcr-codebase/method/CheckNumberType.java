
import java.util.Scanner;

public class CheckNumberType {

    // Method to check number type
    public static int check(int number) {
        if (number > 0) {
            return 1;      // it means Positive no
        } else if (number < 0) {
            return -1;     // it means Negative no 
        } else {
            return 0;      // it means Zero no
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int number = sc.nextInt();//here we enter a no.

        int result = check(number);

        // Display 
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
