
import java.util.Scanner;

public class Check_Pallindrome {

    // Loop se start aur end characters compare karenge idhar
    static boolean checkLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Agar match nahi hua toh palindrome nahi hai
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method (khud ko call karna)
    static boolean checkLogic2(String text, int start, int end) {
        // Base case---> agar saare characters check ho gaye
        if (start >= end) return true;
        
        // Agar characters match nahi karte
        if (text.charAt(start) != text.charAt(end)) return false;
        
        // Recursion--->start ko badhao aur end ko kam karo
        return checkLogic2(text, start + 1, end - 1);
    }

    //  String ko reverse karke character arrays compare karna
    static String reverseString(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev=rev+text.charAt(i);
        }
        return rev;
    }

    static boolean checkLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }
//main method create here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //here we take input
        String input = sc.nextLine().toLowerCase(); // Case ignore karne ke liye

        System.out.println("\n--- Results ---");
        System.out.println("Logic 1 (Loop) " + (checkLogic1(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursion)" + (checkLogic2(input, 0, input.length()-1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Array Reverse) " + (checkLogic3(input) ? "Palindrome" : "Not Palindrome"));
    }
}