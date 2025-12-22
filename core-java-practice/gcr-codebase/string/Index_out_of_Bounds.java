import java.util.Scanner;
public class Index_out_of_Bounds {

    // Generates String index out Of bounds exception
    public static void generateException(String text) {
        System.out.println("Character " + text.charAt(text.length()));
    }

    // here we handles String Index out of bounds exception
    public static void handleException(String text) {
        try {
            System.out.println("Character is " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
            System.out.println("Tried to access index beyond string length");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        String text = sc.next();//taking input

        //call method that generate exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred ");
        }

        // Handle the exception safely
        System.out.println("Handling String Index Out Of Bounds Exception ");
        handleException(text);
    }
}
