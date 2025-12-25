
import java.util.Scanner;

public class KM_to_MILES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter distance in kilometers: ");

        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("Distance in miles: " + miles);
    }
}
