
import java.util.Scanner;

public class Illegal_Argu_Exception {

    // Generates IllegalArgumentException
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    // here we handles IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
            System.out.println("Start index can't be greater than end index");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        String text = sc.next();//here we take input string

        //we call a method that generate exception
        try {
            generateException(text);//this method call exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred");
        }

        //Handle the exception safely
        System.out.println("Handle IllegalArgumentException");
        handleException(text);
    }
}
