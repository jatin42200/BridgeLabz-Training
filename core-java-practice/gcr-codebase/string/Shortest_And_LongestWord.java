
import java.util.Scanner;

public class Shortest_And_LongestWord {

    //  Find length without using length()
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

    // Split text into words using charAt method
    public static String[] split_by_charAt(String text) {
        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = "";
                for (int j = start; j < i; j++) {
                words[index] = words[index] + text.charAt(j);
                }
                index++;
                start = i + 1;
            }
        }

        // Last word
        words[index] = "";
        for (int i = start; i < length; i++) {
            words[index] += text.charAt(i);
        }

        return words;
    }

    // Create 2D array of word and length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // here we find shortest and longest word length
    public static int[] findShortestAndLongest(String[][] table) {
        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);

            if (len < shortest) {
                shortest = len;
            }
            if (len > longest) {
                longest = len;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();//here we take input

        // here we split words
        String[] words = split_by_charAt(text);

        // Create 2D array where we sore word nd length
        String[][] wordTable = createWordLengthTable(words);

        // Find shortest and longest
        int[] result = findShortestAndLongest(wordTable);

        // Display result
        System.out.println("shortest word " + result[0]);
        System.out.println("Longest word " + result[1]);
    }
}
