
import java.util.Scanner;

public class Trignometry_Function {
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radian = Math.toRadians(angle);//here we convert degree to radian

        double sin = Math.sin(radian);
        double cos = Math.cos(radian);
        double tan = Math.tan(radian);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        double angle = sc.nextDouble();//enter angle in degree

        // Call method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display 
        System.out.println("Sine value is: " + result[0]);
        System.out.println("Cosine value is: " + result[1]);
        System.out.println("Tangent value is: " + result[2]);
    }
}
