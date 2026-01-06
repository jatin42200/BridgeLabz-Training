import java.util.*;

public class ParagraphFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paragraph:");
        
        if (!sc.hasNextLine()) return;
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Error: Enter a valid input string!");
            return;
        }

        // 1. Clean up whitespace: Collapse multiple spaces into one
        input = input.trim().replaceAll("\\s+", " ");
        
        // 2. Ensure exactly one space after punctuation marks
        input = input.replaceAll("([.!?])\\s*", "$1 ");

        // 3. Capitalization Logic
        StringBuilder formatted = new StringBuilder(input.trim());
        boolean capitalizeNext = true;

        for (int i = 0; i < formatted.length(); i++) {
            char current = formatted.charAt(i);

            if (capitalizeNext && Character.isLetter(current)) {
                formatted.setCharAt(i, Character.toUpperCase(current));
                capitalizeNext = false; // Reset flag after capitalizing
            } 
            // If we hit a sentence-ending character, set flag for the next letter
            else if (current == '.' || current == '!' || current == '?') {
                capitalizeNext = true;
            }
        }

        System.out.println("\nFormatted String:");
        System.out.println(formatted.toString());
        
        sc.close();
    }
}