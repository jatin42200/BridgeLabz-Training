
import java.util.*;
public class UnitConverter {

    // Convert Kilometers to Miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;//1 km = 0.621371 miles
        return km * km2miles;
    }

    // Convert Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;//1 mile=1.60934 km
        return miles * miles2km;
    }

    // Convert Meters to Feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;//1 m = 3.28084 feet
        return meters * meters2feet;
    }

    // Convert Feet to Meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    //here we crete main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          //here we take input
        double value = sc.nextDouble();//

        System.out.println("Kilometers to Miles: " + convertKmToMiles(value));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(value));
        System.out.println("Meters to Feet: " + convertMetersToFeet(value));
        System.out.println("Feet to Meters: " + convertFeetToMeters(value));
    }
}

