import java.util.Scanner;

public class Maya_BMI_Fitness_Tracker {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<-------Maya's BMI Fitness Tracker------->\n");
        
        // here we take inputs of our client name 
        System.out.print("Enter client name - ");
        String clientName = sc.nextLine();
        
        // here we take height in meter
        System.out.print("Enter height in meter - ");
        double height = sc.nextDouble();
        
        //here we take weight in kg
        System.out.print("Enter weight in kg - ");
        double weight = sc.nextDouble();
        
        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        
        // Determine BMI category using if-else
        String category;
        String healthAdvice;
        
        if (bmi < 18.5) {
            category = "Underweight";
            healthAdvice = "To gain healthy weight, consider a balanced diet.";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal";
            healthAdvice = "Great brother just maintain your healthy lifestyle.";
        } else if (bmi >= 25.0 && bmi < 29.9) {
            category = "Overweight";
            healthAdvice = "just add exercise in your schedule and avoid unwanted stuff in eating";
        } else {
            category = "Obese";
            healthAdvice = "Consult a doctor for your treatment";
        }
        
        // here we Display results
        System.out.println("\n-------- BMI Report for " + clientName + " --------");
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);
        System.out.println("Health Advice: " + healthAdvice);
        System.out.println("---------------------------------------\n");
    }
}