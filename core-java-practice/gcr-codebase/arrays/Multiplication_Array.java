import java.util.Scanner;

public class Multiplication_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        int num = sc.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] table = new int[10];

        // here we calculate and store result
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        //this loop for display
        System.out.println("\nMultiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }
}
