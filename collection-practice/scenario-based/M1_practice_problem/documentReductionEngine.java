import java.util.*;
public class documentReductionEngine {

    public static String processLine(String input) {

        // Mask National ID
        input = input.replaceAll("ID:[A-Z]{3}\\d{6}", "ID:XXX******");

        //  Mask Bank Account (keep last 4 digits)
        input = input.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})", "ACCT---$1");

        //  Remove consecutive repeated words (case insensitive)
        input = input.replaceAll("(?i)\\b(\\w+)\\b\\s+\\1\\b", "$1");

        //  Fix trailing special symbols (!, ?, .)
        input = input.replaceAll("([!?\\.])\\1{2,}$", "$1");

        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(processLine(line));
        }

    }
}