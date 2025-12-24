
import java.util.Scanner;

public class Simple_Interest {

    // Method to calculate Simple Interest
    public static double calc_Simple_Intrest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take inputs for principal,time and rate 

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double SI = calc_Simple_Intrest(principal, rate, time);

        // Display 
        System.out.println("The Simple Interest is "+ SI +" for Principal " +principal +" Rate of Interest " +rate +" and Time "+time);
    }
}

