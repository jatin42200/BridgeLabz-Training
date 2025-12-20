
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();//here we enter a num

        int original_Number = num; // store original number
        int sum = 0;

        while (original_Number != 0) {
            int digit = original_Number % 10;   // for getting last digit
            sum += digit * digit * digit;      // this line store cube and add to sum
            original_Number = original_Number / 10; // this line is used to remove last digit
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
