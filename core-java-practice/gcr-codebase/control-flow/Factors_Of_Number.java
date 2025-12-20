import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("The number is not a positive integer");
        } else {
            System.out.println("Factors of " + num + " are:");

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

