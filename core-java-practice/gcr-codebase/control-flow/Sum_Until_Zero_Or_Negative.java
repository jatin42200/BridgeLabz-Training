import java.util.Scanner;

public class Sum_Until_Zero_Or_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double value = sc.nextDouble();//here we take user input for value

            if (value <= 0) {
                break;
            }
            total=total+value;
        }

        System.out.println("The total sum is "+total);
    }
}
