
import java.util.Scanner;

public class Character_Type_Table {

    // this section is to Check character type
    public static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check for consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // Otherwise
        return "Not a Letter";
    }

    // Create 2D array of character and its type
    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    //  Display 2D array in tabular format
    public static void displayTable(String[][] table) {

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        String text = sc.nextLine();//here we neter the string

        // Analyze string
        String[][] table = analyzeString(text);

        // Display result
        displayTable(table);

    }
}
