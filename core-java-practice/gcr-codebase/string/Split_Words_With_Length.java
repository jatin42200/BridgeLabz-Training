
import java.util.Scanner;

public class Split_Words_With_Length {

    // here we find length without using length method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // in this block we split text into words using charAt method
    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);

        // Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = "";
                for (int j = start; j < i; j++) {
                    words[wordIndex] += text.charAt(j);
                }
                wordIndex++;
                start = i + 1;
            }
        }

        // Last word
        words[wordIndex] = "";
        for (int i = start; i < length; i++) {
            words[wordIndex] += text.charAt(i);
        }

        return words;
    }

    //Create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split words
        String[] words = splitUsingCharAt(text);

        // Create 2D array (word + length)
        String[][] result = createWordLengthTable(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]); // convert String to int
            System.out.println(result[i][0] + "\t" + len);
        }
    }
}
