import java.util.Scanner;
public class Substring_Que {
    // here we create sub string using charAt method 
    public static String Using_CharAt(String text, int start, int end) {
        String res = "";//it is for restoring result that has been calculated by charAt method

        for (int i = start; i < end; i++) {
            res=res+text.charAt(i);
        }

        return res;
    }

    // here we Compare two strings using charAt()
    public static boolean Using_CharAt(String s1, String s2) {

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

        // here we take Inputs
        String text = sc.next();//here we enter string
        int start = sc.nextInt();//here we enter starting index
        int end = sc.nextInt();//here we enter last index

        // Manual substring
        String manual_Substring = Using_CharAt(text, start, end);

        // Built-in substring
        String builtIn_Substring = text.substring(start, end);

        // Compare both substrings
        boolean isSame = Using_CharAt(manual_Substring, builtIn_Substring);

        // Output
        System.out.println("Substring using charAt() " + manual_Substring);
        System.out.println("Substring using built-in method " + builtIn_Substring);

        if (isSame) {
            System.out.println("Both substrings are same");
        } else {
            System.out.println("Both substrings are different");
        }
    }
}
