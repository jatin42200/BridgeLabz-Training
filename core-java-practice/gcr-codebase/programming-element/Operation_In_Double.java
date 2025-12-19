import java.util.Scanner;
public class Operation_In_Double {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        // here we take inputs of a,b and c
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // here we compute all the double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        // here we print the output
        System.out.println("The results of double Operations are "+result1+", "+result2+", " +result3+", and "+result4);
    }
}
