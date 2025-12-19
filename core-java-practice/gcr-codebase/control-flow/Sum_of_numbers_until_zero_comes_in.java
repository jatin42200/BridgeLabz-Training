import java.util.Scanner;

public class Sum_of_numbers_until_zero_comes_in{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double value;

        System.out.print("Enter a number: ");
        value = sc.nextDouble();

        while (value != 0) {
            total=total+value;

            System.out.print("Enter a number: ");
            value = sc.nextDouble();
        }

        System.out.println("The total sum is " +total);
    }
}