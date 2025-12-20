
import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();//enter weight in kg
        double heightCm = sc.nextDouble();//enter height in cm


         //if is used to handle negative things
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Invalid input. Weight and height must be positive.");
        } 
        //here we create BMI calculator
        else {
            double heightMeter = heightCm / 100; // cm to meter
            double bmi = weight / (heightMeter * heightMeter);

            System.out.println("BMI = " + bmi);

            if (bmi <= 18.4) {
                System.out.println("Status-->  Underweight");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Status-->  Normal");
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                System.out.println("Status-->  Overweight");
            } else {
                System.out.println("Status--> Obese");
            }
        }
    }
}
