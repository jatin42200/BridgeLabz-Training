
import java.util.Scanner;

public class BMI_Score {

    //Method to find BMI and Status
    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // Method to compute all data and store in a 2D String Array
    static String[][] processData(double[][] inputData) {
        String[][] results = new String[10][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < inputData.length; i++) {
            double weight = inputData[i][0];
            double heightCm = inputData[i][1];
            
            // Convert height to meters for formula: BMI = kg / m^2
            double heightM = heightCm / 100.0;
            double bmiValue = weight / (heightM * heightM);
            
            // Formatting values to store in String array
            results[i][0] = String.valueOf(heightCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmiValue); // 2 decimal points
            results[i][3] = getStatus(bmiValue);
        }
        return results;
    }

    // display
    static void displayTable(String[][] table) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1] + "\t\t" + table[i][2] + "\t\t" + table[i][3]);
        }
    }

    // here we create main methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2]; // a. Store weight and height

        System.out.println("Enter details for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] finalResults = processData(personData);
        displayTable(finalResults);//call display

    }
}