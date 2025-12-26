
import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String target = sc.next();
        String replacement = sc.next();

        String result = myReplace(sentence, target, replacement);
        System.out.println(result);
    }

    public static String myReplace(String str, String target, String replacement) {
        // 1. Sentence ko words mein todna
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        // 2. Har word ko check karna
        for (String word : words) {
            if (word.equals(target)) {
                sb.append(replacement); // Agar match ho toh naya word lagao
            } else {
                sb.append(word); // Warna purana hi rehne do
            }
            sb.append(" "); // Word ke baad space wapas lagana
        }

        return sb.toString().trim(); // Aakhiri extra space hatane ke liye trim()
    }
}