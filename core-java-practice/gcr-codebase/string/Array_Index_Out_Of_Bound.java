
import java.util.Scanner;

public class Array_Index_Out_Of_Bound {

    // Generates array out of bound exception
    public static void generateException(String[] names) {
        System.out.println("Name is equal to " + names[names.length]);//accesing element equal to length is illegal
    }

    //  Handles array out of bound exception
    public static void handleException(String[] names) {
        try {
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception caught");
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//enter array size
        sc.nextLine(); // consume newline

        // initialize an array
        String[] names = new String[n];

        // Take input in an array
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Generate an exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // here we handla exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);
    }
}
