import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D array: 7 days x 24 hours
        float[][] temperature = new float[7][24];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        System.out.println("-------------------------------------------");
        System.out.println("     WEEKLY TEMPERATURE ANALYZER");
        System.out.println("-------------------------------------------\n");
        
        // Input temperature data
        System.out.println("Enter temperature data for the week:");
        System.out.println("(Enter 24 hourly temperatures for each day)\n");
        
        for (int day = 0; day < 7; day++) {
            System.out.println("--- " + days[day] + " ---");
            for (int hour = 0; hour < 24; hour++) {
                System.out.print("Hour " + hour + ": ");
                temperature[day][hour] = sc.nextFloat();
            }
            System.out.println();
        }
        
        // Call analysis methods
        findHottestDay(temperature, days);
        findColdestDay(temperature, days);
        calculateAveragePerDay(temperature, days);
    }
    
    // Method to find hottest day
    public static void findHottestDay(float[][] temp, String[] days) {
        float maxTemp = Float.MIN_VALUE;
        int hottestDay = 0;
        int hottestHour = 0;
        
        for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                if (temp[day][hour] > maxTemp) {
                    maxTemp = temp[day][hour];
                    hottestDay = day;
                    hottestHour = hour;
                }
            }
        }
        
        System.out.println("\n-------------------------------------------");
        System.out.println("          HOTTEST DAY ANALYSIS");
        System.out.println("-------------------------------------------");
        System.out.println("Hottest Day    : " + days[hottestDay]);
        System.out.println("Temperature    : " + maxTemp + "°C");
        System.out.println("Time           : " + hottestHour + ":00 hours");
    }
    
    // Method to find coldest day
    public static void findColdestDay(float[][] temp, String[] days) {
        float minTemp = Float.MAX_VALUE;
        int coldestDay = 0;
        int coldestHour = 0;
        
        for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                if (temp[day][hour] < minTemp) {
                    minTemp = temp[day][hour];
                    coldestDay = day;
                    coldestHour = hour;
                }
            }
        }
        
        System.out.println("\n-------------------------------------------");
        System.out.println("          COLDEST DAY ANALYSIS");
        System.out.println("-------------------------------------------");
        System.out.println("Coldest Day    : " + days[coldestDay]);
        System.out.println("Temperature    : " + minTemp + "°C");
        System.out.println("Time           : " + coldestHour + ":00 hours");
    }
    
    // Method to calculate average temperature per day
    public static void calculateAveragePerDay(float[][] temp, String[] days) {
        System.out.println("\n-------------------------------------------");
        System.out.println("       AVERAGE TEMPERATURE PER DAY");
        System.out.println("-------------------------------------------");
        
        for (int day = 0; day < 7; day++) {
            float sum = 0;
            for (int hour = 0; hour < 24; hour++) {
                sum += temp[day][hour];
            }
            float average = sum / 24;
            System.out.printf("%-12s : %.2f°C\n", days[day], average);
        }
    }
}