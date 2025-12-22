
import java.util.Scanner;

public class Lower_Case_Comparison {

    // Method 1: Convert text to lowercase using charAt method and ascii logic
    public static String convertToLowerCaseManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result=result+ch;
        }

        return result;
    }

    // Compare two strings using charAt method
    public static boolean compareUsingCharAt(String s1, String s2) {

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
        String text = sc.nextLine();//here we take input string

        // manully lowercase conversion
        String manualLower = convertToLowerCaseManual(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // here we Compare both results
        boolean isSame = compareUsingCharAt(manualLower, builtInLower);

        // Display results
        System.out.println("Lowercase using " + manualLower);
        System.out.println("Lowercase using  " + builtInLower);

        System.out.println("Are both results same " + isSame);

    }
}
