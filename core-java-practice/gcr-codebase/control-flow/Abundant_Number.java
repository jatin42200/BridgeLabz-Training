
import java.util.Scanner;

public class Abundant_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we take input


        //if is here to handle negative input
        if (num <= 0) {
            System.out.println("Please enter a positive integer");
        } 
        //else is here to check the number is abundant or not
        else {
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum =sum + i;
                }
            }

            if (sum > num) {
                System.out.println(num + " is an Abundant Number");
            } else {
                System.out.println(num + " is not an Abundant Number");
            }
        }
}
