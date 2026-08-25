import java.util.Scanner;

public class ReverseStringOrException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        try {

            // Check if input is a number
            if (input.matches("\\d+")) {
                throw new IllegalArgumentException("Invalid input");
            }

            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            System.out.println(reversed);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}