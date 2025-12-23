
import java.util.Scanner;

public class String_Length {

    // Method to find string length by using charAt method
    public static int find_Length(String text) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;//exception happened when index become more than the length
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        String text = sc.next();

        // User-defined length
        int manual_Length = find_Length(text);

        // Built-in length
        int builtIn_Length = text.length();

        // here Display results
        System.out.println("Length using user-defined method: " + manual_Length);
        System.out.println("Length using built-in method: " + builtIn_Length);
    }
}
