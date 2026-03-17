import java.util.*;

public class documentReductionEngine {

    public static String processLine(String input) {
        if (input == null || input.isEmpty()) return input;

        input = input.replaceAll("ID:[A-Z]{3}\\d{6}", "ID:XXX******");

        // Fixed regex to match the standard format and replace properly
        input = input.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})", "ACCT-XXXX-XXXX-$1");

        // Fixed: Added "+" to handle 3 or more repetitions (e.g., "test test test" -> "test")
        input = input.replaceAll("(?i)\\b(\\w+)\\b(?:\\s+\\1\\b)+", "$1");

        // Removed '$' so it works everywhere, not just at the very end of the string
        input = input.replaceAll("([!?\\.])\\1+", "$1");

        return input.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return; 
        
        int n = sc.nextInt(); 
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            if (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(processLine(line));
            }
        }
    }
}