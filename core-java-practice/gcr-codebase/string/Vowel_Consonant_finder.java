
import java.util.Scanner;

public class Vowel_Consonant_finder {

    public static int checkCharType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || 
            ch == 'o' || ch == 'u') {
            return 1;//here we check 1 for vowel
        }

        // Check if consonant
        if (ch >= 'a' && ch <= 'z') {
            return 2;//here we check 2 for consonent
        }

        // Not a letter
        return 0;
    }

    // Method 2: Count vowels and consonants
    public static int[] count_Vowels_And_Consonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int result = checkCharType(ch);

            if (result == 1) {
                vowels++;
            } else if (result == 2) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input
        String text = sc.nextLine();//here we enter string

        // Get counts
        int[] result = count_Vowels_And_Consonants(text);

        // Display 
        System.out.println("Vowels count " + result[0]);
        System.out.println("Consonants count " + result[1]);
    }
}

