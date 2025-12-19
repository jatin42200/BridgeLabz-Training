import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // here we take inputs of number1 and number2
        double number1=sc.nextDouble();
        double number2=sc.nextDouble();

        // arithmetic operations
        double add=number1+number2;
        double subtract=number1-number2;
        double multiple=number1*number2;
        double divide=number1/number2;

        //here we print the output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2 + " is "+add+", " +subtract+ ", " +multiple+", and "+divide);
    }
}