
import java.util.Scanner;

public class Split_Text_Comparison {

    // here we find length without using length()
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
    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);

        //  here we count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = "";
            for (int j = start; j < spaceIndex[i]; j++) {
                words[i] += text.charAt(j);
            }
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += text.charAt(i);
        }

        return words;
    }

    // Compare two String arrays using charAt()
    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (findLength(a[i]) != findLength(b[i])) {
                return false;
            }
            for (int j = 0; j < findLength(a[i]); j++) {
                if (a[i].charAt(j) != b[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //here we take full text input
        String text = sc.nextLine();

        // User-defined split
        String[] manual_Split = splitUsingCharAt(text);

        // Built-in split
        String[] builtIn_Split = text.split(" ");

        // Compare results
        boolean isSame = compareStringArrays(manual_Split, builtIn_Split);

        // Display words
        System.out.println("Words using charAt():");
        for (String w : manual_Split) {
            System.out.println(w);
        }

        System.out.println("Words using split():");
        for (String w : builtIn_Split) {
            System.out.println(w);
        }

        System.out.println("Are both results same " + isSame);

    }
}

