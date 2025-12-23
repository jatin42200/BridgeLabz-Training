
import java.util.Scanner;

public class Freq_Using_Unique_Char {

    //  Method to find unique characters using nested loops 
    static char[] findUniqueCharacters(String str) {
        int n = str.length();
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            // Check if character appeared before or not
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++] = str.charAt(i);
            }
        }

        // Exact size ka array banana
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    //find frequency and return in 2d array
    static String[][] getFrequencyTable(String str) {
        // ASCII array for frequency (size 256)
        int[] freq = new int[256];

        // Loop through text to find frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Call uniqueCharacters() method
        char[] uniqueChars = findUniqueCharacters(str);

        //Create 2D String array (Rows = Unique chars, Columns = 2 [Char, Freq])
        String[][] table = new String[uniqueChars.length][2];

        // Loop through unique characters to store results
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            table[i][0] = String.valueOf(c);    // Character store kiya
            table[i][1] = String.valueOf(freq[c]); // Uski frequency store ki
        }

        return table;
    }
    //main method-------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        // Method call
        String[][] result = getFrequencyTable(input);

        // Result display
        System.out.println("\nCharacter  Frequency");
        System.out.println("-------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println("   " + result[i][0] +"   " + result[i][1]);
        }
    }
}