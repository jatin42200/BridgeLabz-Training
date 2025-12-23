
import java.util.Scanner;

public class Freq_Using_Nested_Loop {

    // Method to find frequency and return it 1d array
    static String[] findFrequency(String text) {
        // String ko character array mein badalna
        char[] characters = text.toCharArray();
        int n = characters.length;
        int[] freq = new int[n];

        //Nested Loop logic to find frequency
        for (int i = 0; i < n; i++) {
            // Agar character '0' hai, matlab hum ise pehle hi count kar chuke hain
            if (characters[i] == '0') {
                continue;
            }

            freq[i] = 1; // Har naye character ki shuruati frequency 1 hogi

            for (int j = i + 1; j < n; j++) {
                if (characters[i] == characters[j]) {
                    freq[i]++;
                    // Duplicate character ko '0' set kar dena taaki dobara count na ho
                    characters[j] = '0';
                }
            }
        }

        // Unique results ginna taaki 1D String array ka size pata chale
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // 1D String array mein result store karna
        String[] result = new String[uniqueCount];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (characters[i] != '0') {
                result[k] = characters[i] + " -> " + freq[i];
                k++;
            }
        }

        return result;
    }

    //here we create main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //here we take input
        String input = sc.nextLine();//input a string

        // Method call
        String[] frequency_Array = findFrequency(input);

        // Display
        System.out.println("Frequency Result");
        for (String s : frequency_Array) {
            System.out.println(s);
        }
    }
}