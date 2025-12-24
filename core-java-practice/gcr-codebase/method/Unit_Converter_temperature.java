
import java.util.Scanner;

public class Unit_Converter_temperature {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit_to_celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit_to_celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius_to_fahrenheit = (celsius * 9 / 5) + 32;
        return celsius_to_fahrenheit;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds_to_kilograms = 0.453592;
        return pounds * pounds_to_kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms_to_pounds = 2.20462;
        return kilograms * kilograms_to_pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons_to_liters = 3.78541;
        return gallons * gallons_to_liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters_to_gallons = 0.264172;
        return liters * liters_to_gallons;
    }

    // here we create main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking input
        double val = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(val));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(val));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(val));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(val));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(val));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(val));
    }
}
