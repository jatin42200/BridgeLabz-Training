
import java.util.Scanner;
public class Trim_String_Comparison {

    // here we find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    //  Create substring using charAt method
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt function
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        String text = sc.nextLine();//here we enter text with spaces

        // User-defined trim logic
        int[] indexes = findTrimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare results
        boolean isSame = compareStrings(manualTrim, builtInTrim);

        // Display result
        System.out.println("Manual Trim Result --> [" + manualTrim + "]");
        System.out.println("Built-in Trim Result --> [" + builtInTrim + "]");
        System.out.println("Are both results same --> " + isSame);
    }
}
