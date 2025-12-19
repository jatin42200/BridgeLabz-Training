import java.util.Scanner;
public class Operation {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        // here we take inputs of a,b and c
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // here we compute all the integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        // here we print the output
        System.out.println("The results of Int Operations are "+result1+", "+result2+", " +result3+", and "+result4);
    }
}
