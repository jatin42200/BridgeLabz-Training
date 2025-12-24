import java.util.Scanner;

public class Quadratic_Equation {

    // returns array of roots
    public static double[] findRoots(double a, double b, double c) {

        // calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // if delta is positive → two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // if delta is zero → one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // if delta is negative → no real roots
        else {
            return new double[]{}; // empty array
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //here we take inputs
        double a = sc.nextDouble();//input a
        double b = sc.nextDouble();//input b
        double c = sc.nextDouble();//input c

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        } 
        else {
            System.out.println("No real roots ");
        }
    }
}
