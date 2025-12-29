
import java.util.Scanner;

public class TempConverter {
    // Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(c));

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(f));
    }
}
