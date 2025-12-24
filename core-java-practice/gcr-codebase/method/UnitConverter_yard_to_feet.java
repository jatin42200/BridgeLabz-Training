
import java.util.Scanner;

public class UnitConverter_yard_to_feet {
    // Convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards_to_feet=3;
        return yards * yards_to_feet;
    }

    // Convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet_to_yards=0.333333;
        return feet * feet_to_yards;
    }

    // Convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters_to_inches=39.3701;
        return meters * meters_to_inches;
    }

    // Convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches_to_meters=0.0254;
        return inches * inches_to_meters;
    }

    // Convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches_to_cm=2.54;
        return inches * inches_to_cm;
    }

    // here we create main method
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //taking inputs
        double value=sc.nextDouble();//here we enter value

        System.out.println("Yards to Feet: "+convertYardsToFeet(value));
        System.out.println("Feet to Yards: "+convertFeetToYards(value));
        System.out.println("Meters to Inches: "+convertMetersToInches(value));
        System.out.println("Inches to Meters: "+convertInchesToMeters(value));
        System.out.println("Inches to Centimeters: "+convertInchesToCentimeters(value));

    }
}
