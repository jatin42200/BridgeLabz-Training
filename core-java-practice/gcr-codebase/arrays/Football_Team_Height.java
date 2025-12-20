
import java.util.Scanner;

public class Football_Team_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        
        // Input heights of all football players
   
        for (int i = 0; i < height.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            sum =sum + height[i];
        }
        
        // here we calculate mean
        double mean = sum / height.length;
        
        // here we display result
        System.out.println("\n--- Results ---");
        System.out.println("Total sum: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }
}