import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    // Reverses a string using StringBuilder (efficient)
    private static String reverseString(String input) {

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }
}
