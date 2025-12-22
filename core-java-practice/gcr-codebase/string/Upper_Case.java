import java.util.Scanner;

public class Upper_Case {

    // Convert text to uppercase 
    public static String convertUpperCaseManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // convert lowercase to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result=result+ch;
        }

        return result;
    }

    // Compare two strings by using 
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

        String text = sc.nextLine();//here we take inputs

        //  converted by using manual uppercase converted
        String manualUpper = convertUpperCaseManual(text);

        // converted by using Built-in uppercase 
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean isSame = compareUsingCharAt(manualUpper, builtInUpper);

        // Display output
        System.out.println("Uppercase using  " + manualUpper);
        System.out.println("Uppercase using  " + builtInUpper);

        System.out.println("Are both results same? " + isSame);
    }
}
