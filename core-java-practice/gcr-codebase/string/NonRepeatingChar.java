
import java.util.Scanner;

public class NonRepeatingChar {

    // Method to find the first non-repeating character
    static char findFirstUnique(String str) {
        int[] frequency = new int[256];//for ascii value

        // Har character ki frequency count karein
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; // Character ki ASCII value index ka kaam karegi
        }

        // Pehla character dhundein jiska count 1 ho
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch; // Mil gaya pehla unique character
            }
        }

        // Agar koi unique character nahi mila toh null character return karein
        return '\0';//null character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //here we take input
        String input = sc.nextLine();//input a string

        char result = findFirstUnique(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is = " + result);
        } else {
            System.out.println("Koi bhi character non-repeating nahi hai.");
        }
    }
}