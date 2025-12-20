
import java.util.Scanner;

public class BMI_Multiple_Persons {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we enter Number of persons
        System.out.print("Enter number of persons  ");
        int n = sc.nextInt();

        // create Arrays to store data
        double[]weight=new double[n];
        double[]height=new double[n];
        double[]bmi=new double[n];
        String[]status=new String[n];

        // c. Take input for weight and height
        for (int i=0; i<n; i++) {

            System.out.print("Enter weight in kg");
            weight[i]=sc.nextDouble();

            System.out.print("Enter height in cm");
            height[i]=sc.nextDouble();

            // Convert height from cm to meter
            double heightMeter=height[i]/100;

            // Calculate BMI
            bmi[i]=weight[i]/(heightMeter*heightMeter);

            // f. Determine weight status
            if (bmi[i]<=18.4) {
                status[i]="Underweight";
            } else if (bmi[i]<=24.9) {
                status[i]="Normal";
            } else if (bmi[i]<=39.9) {
                status[i]="Overweight";
            } else {
                status[i]="Obese";
            }
        }

        // here we Display details
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i]+" cm");
            System.out.println("Weight: " + weight[i]+" kg");
            System.out.printf("BMI: %.2f%n",bmi[i]);
            System.out.println("Status: "+status[i]);
        }
    }
}
