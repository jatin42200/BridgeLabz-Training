import java.util.*;
public class Frequent_Char {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in());
        String input = sc.next();;
        char result = findMostFrequentChar(input);
        
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char findMostFrequentChar(String str) {
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        // 3. Traverse the string again or the count array to find the max frequency
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
}