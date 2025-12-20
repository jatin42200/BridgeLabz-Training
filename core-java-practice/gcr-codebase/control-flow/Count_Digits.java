
import java.util.Scanner;

public class Count_Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we enter a number

        int count = 0;

        // Special case>---> 0 has 1 digit
        if (num == 0) {
            count = 1;
        } else {
            // Handle negative numbers
            num = Math.abs(num);

            while (num != 0) {
                num = num / 10; // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}
