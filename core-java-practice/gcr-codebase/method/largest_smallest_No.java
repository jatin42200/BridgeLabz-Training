
import java.util.Scanner;

public class largest_smallest_No {
    // Method to find smallest and largest of three no.
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int min = number1;
        int max = number1;

        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take 3 no. as an inputs

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // Call method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display 
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }
}
