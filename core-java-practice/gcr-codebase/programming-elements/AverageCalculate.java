
import java.util.Scanner;

public class AverageCalculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter three numbers:  ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double average = (n1 + n2 + n3) / 3;

        System.out.println("Average = " + average);

    }
}
