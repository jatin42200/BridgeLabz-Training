
import java.util.Scanner;
public class Store_Values_And_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] num = new double[10]; // array of max size 10
        double total = 0.0;
        int idx = 0;

        // Infinite loop for user input
        while (true) {
            System.out.print("Enter 0 or negative to stop");
            double value = sc.nextDouble();

            // Stop if value is 0 or -ive
            if (value <= 0) {
                break;
            }

            // Stop if array is out of limit 
            if (idx == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            num[idx] = value;// Store value in array
            idx++;
        }

        // here we calculate sum using for loop
        for (int i = 0; i < idx; i++) {
            total =total + num[i];
        }

        //here we Display stored numbers
       
        for (int i = 0; i < idx; i++) {
            System.out.println(num[i]);
        }

        //here we display total
        System.out.println("\nTotal sum = " + total);

    }
}
