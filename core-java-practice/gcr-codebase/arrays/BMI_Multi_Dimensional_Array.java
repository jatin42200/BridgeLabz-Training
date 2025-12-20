
import java.util.Scanner;

public class BMI_Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input for number of persons
        int num = sc.nextInt();

        double[][]person_Data =new double[num][3];
        String[] weight_Status=new String[num];

        // here we take input weight and height with validation
        for (int i=0; i<num; i++) {
            System.out.println("\nPerson " + (i + 1));
            while (true) {
                System.out.print("Enter weight in kg ");
                double weight=sc.nextDouble();
                if (weight > 0) {
                    person_Data[i][0]=weight;
                    break;
                }
                System.out.println("Weight must be positive. Try again.");
            }

            // Here we take height input 
            while (true) {
                System.out.print("Enter height in cm");
                double height=sc.nextDouble();
                if (height>0) {
                    person_Data[i][1]=height;
                    break;
                }
                System.out.println("Height must be positive. Try again.");
            }

            // Convert height to meters
            double height_Meter=person_Data[i][1] / 100;

            // Calculate BMI
            person_Data[i][2]=person_Data[i][0] / (height_Meter * height_Meter);

            // Determine weight status
            if (person_Data[i][2]<=18.4) {
                weight_Status[i]="Underweight";
            } else if (person_Data[i][2]<=24.9) {
                weight_Status[i] = "Normal";
            } else if (person_Data[i][2]<=39.9) {
                weight_Status[i]="Overweight";
            } else {
                weight_Status[i]="Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < num; i++) {
            System.out.println("\nPerson "+(i + 1));
            System.out.println("Weight: "+person_Data[i][0] + " kg");
            System.out.println("Height: "+person_Data[i][1] + " cm");
            System.out.printf("BMI: %.2f%n", person_Data[i][2]);
            System.out.println("Status: "+weight_Status[i]);
        }
    }
}
