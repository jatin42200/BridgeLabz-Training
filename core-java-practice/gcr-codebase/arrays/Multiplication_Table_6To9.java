
import java.util.Scanner;

public class Multiplication_Table_6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        int num = sc.nextInt();

        // Array to store multiplication results from 6 to 9
        int[]Result = new int[4];

        // Store results in array
        int idx = 0;
        for (int i = 6; i <= 9; i++) {
        Result[idx] = num * i;
            idx++;
        }

        //here we Display results
        System.out.println("\nMultiplication table of " + num + " from 6 to 9:");
        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " +Result[idx]);
            idx++;

    }
}
}
