
import java.util.Scanner;

public class BMI_Calculator {

    // in this method we calculate BMI score
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];// in kg
            double height_Cm = data[i][1];// in cm

            double height_Meter = height_Cm / 100; // convert cm to meter
            double bmi = weight / (height_Meter * height_Meter);

            data[i][2] = bmi;// it store bmi score
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    //here we declear main method
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 rows, 3 columns (weight, height, BMI)
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < 10; i++) {

            persons[i][0] = sc.nextDouble();//here we input weight

            persons[i][1] = sc.nextDouble();//here we input height
        }

        // here we calculate bmi score
        calculateBMI(persons);

        // Get BMI Status
        String[] bmiStatus = getBMIStatus(persons);

        // Display result
        System.out.println("\n--- BMI REPORT ---");
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f    %.2f    %.2f    %s\n",persons[i][0],persons[i][1],persons[i][2],bmiStatus[i]);
        }
    }
}
