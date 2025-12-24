import java.util.Scanner;

public class Wind_chill_Temp {

    // Method to calculate wind chill temperature
    public static double calculate_WindChill(double temp, double windSpeed) {

        double windChill = 35.74+ 0.6215 * temp+ (0.4275 * temp - 35.75)* Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        double temp = sc.nextDouble();//enter tempersture here
        double windSpeed = sc.nextDouble();//enter wind speed 

        // Calculate wind chill
        double result = calculate_WindChill(temp, windSpeed);

        // Display result
        System.out.println("Wind Chill Temperature is: " + result);
    }
}
