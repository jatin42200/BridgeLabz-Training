import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();//here we enter a number

        if (num <= 0) {
            System.out.println("The number is not positive");
        } else {
            System.out.println("the Factors of "+num+" are:");

            int count = 1;
            while (count < num) {
                if (num % count == 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}

