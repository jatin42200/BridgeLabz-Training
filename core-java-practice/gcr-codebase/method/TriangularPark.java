
import java.util.Scanner;

public class TriangularPark {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for triangle sides in meter

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display 
        System.out.println("The athlete needs to complete " + rounds +" rounds to finish a 5 km run.");
    }
}
