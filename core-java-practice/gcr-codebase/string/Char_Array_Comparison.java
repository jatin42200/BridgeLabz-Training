
import java.util.Scanner;

public class Char_Array_Comparison {

    // Convert string to char array using charAt()
    public static char[] get_char_by_charAt(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    // in this part we Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {//in this line we check the length of both array
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we take input

        String text = sc.next();//input the string

        // User-defined method
        char[] manualChars =get_char_by_charAt(text);

        // Built-in method
        char[] builtInChars = text.toCharArray();

        // here we Compare both arrays
        boolean isSame = compareCharArrays(manualChars, builtInChars);

        // int this section we Display results
        System.out.print("Characters using charAt(): ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.print("Characters using cahrArray");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        // Display comparison result
        System.out.println("Are both character arrays same " + isSame);
    }
}
