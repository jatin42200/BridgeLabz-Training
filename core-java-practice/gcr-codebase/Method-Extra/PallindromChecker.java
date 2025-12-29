
import java.util.Scanner;

public class PallindromChecker {

    // Function to take input string
    static String takeInput(Scanner sc) {
        
        return sc.nextLine();//here we enter a string
    }

    // Function to check palindrome
    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not palindrome
            }
            start++;
            end--;
        }

        return true; // Palindrome
    }

    // Function to display result
    static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
