
import java.util.Scanner;

public class CheckAnagram {
    
    public static boolean areAnagrams(String text1, String text2) {
        //  Check if lengths are equal or not
        if (text1.length() != text2.length()) {
            return false;
        }
        
        //  Create frequency arrays
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            char c1 = Character.toLowerCase(text1.charAt(i));
            char c2 = Character.toLowerCase(text2.charAt(i));
            
            if (c1 >= 'a' && c1 <= 'z') {
                freq1[c1 - 'a']++;
            }
            if (c2 >= 'a' && c2 <= 'z') {
                freq2[c2 - 'a']++;
            }
        }
        
        // Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //taking inputs
        String text1 = scanner.nextLine();//input first string in lowercase only
        
        
        String text2 = scanner.nextLine();//enter second string in lowercase
        
        // Display 
        System.out.println("\n--- Result ---");
        if (areAnagrams(text1, text2)) {
            System.out.println(text1+" and "+text2+" ARE anagrams!");
        } else {
            System.out.println(text1+" and "+text2+" are NOT anagrams.");
        }

    }
}
