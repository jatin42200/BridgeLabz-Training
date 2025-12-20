import java.util.Scanner;

public class Greatest_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();//here we enetr a number

        if (num <= 1) {
            System.out.println("No greatest factor exists for the given number");
        } else {
            int greatest_Factor = 1;

            for (int i = num - 1; i >= 1; i--) {
                if (num % i == 0) {
                    greatest_Factor = i;
                    break;
                }
            }

            System.out.println("The greatest factor of " + num + " beside itself is " + greatest_Factor);
        }
    }
}
