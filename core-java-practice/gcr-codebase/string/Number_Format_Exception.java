
import java.util.Scanner;

public class Number_Format_Exception {

    // Generates NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // may throw exception
        System.out.println("Number is  " + number);
    }

    //  Handles NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is  " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
            System.out.println("Input string is not a valid number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input as String
        String text = sc.next();

        //here we Generate the exception
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred");
        }

        //Handle the exception safely
        System.out.println("Handling NumberFormatException:");
        handleException(text);
    }
}
