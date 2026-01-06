import java.util.*;

public class ParagraphOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Paragraph:");
        String input = sc.nextLine();
        
        // Basic validation
        if (input == null || input.trim().isEmpty()) {
            System.out.println("The paragraph is empty!");
            return;
        }

        System.out.print("Enter word to be replaced: ");
        String targetWord = sc.next();
        
        System.out.print("Enter New Word: ");
        String replacementWord = sc.next();
        
        // Using word boundaries \b to ensure we match whole words only
        // Example: replacing "is" won't affect "this" or "island"
        String newParagraph = input.replaceAll("(?i)\\b" + targetWord + "\\b", replacementWord);
        
        System.out.println("\n--- Results ---");
        int wordCount = processText(input.trim());
        
        System.out.println("Total word count: " + wordCount);
        System.out.println("Modified Paragraph: " + newParagraph);
        
        sc.close();
    }
    
    /**
     * Finds the longest word and counts total words.
     */
    public static int processText(String input) {
        // Splitting by whitespace to get individual words
        String[] words = input.split("\\s+");
        
        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            return 0;
        }

        String longestWord = words[0];
        for (String currentWord : words) {
            // Clean punctuation from word for more accurate length comparison
            String cleanWord = currentWord.replaceAll("[^a-zA-Z]", "");
            String cleanLongest = longestWord.replaceAll("[^a-zA-Z]", "");
            
            if (cleanWord.length() > cleanLongest.length()) {
                longestWord = currentWord;
            }
        }
        
        System.out.println("Longest Word identified: " + longestWord);
        return words.length;
    }
}