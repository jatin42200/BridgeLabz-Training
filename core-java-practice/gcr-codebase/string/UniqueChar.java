
import java.util.Scanner;

public class UniqueChar {

    // Method to find length without using length function
    static int getCustomLength(String str) {
        int count = 0;
        try {
            // Hum tab tak loop chalayenge jab tak Exception na aa jaye
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // String khatam hone par exception aayega aur humein length mil jayegi
        }
        return count;
    }

    // Method to find unique characters using charAt function
    static char[] findUniqueChars(String str) {
        int len = getCustomLength(str);
        char[] tempArray = new char[len];
        int uniqueCount = 0;

        // bahar bala loop-----> Har character ko ek-ek karke uthayega
        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            boolean isAlreadyPresent = false;

            // andar bala loop---> Check karega ki kya yeh character pehle aa chuka hai
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isAlreadyPresent = true;
                    break;
                }
            }

            // Agar pehle nahi aaya, toh array mein add kar do
            if (!isAlreadyPresent) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // crete new array to store unique character to remove extra spaces
        char[] finalArray = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalArray[i] = tempArray[i];
        }

        return finalArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //here we take input
        String input = sc.nextLine();//input string

        // Length method call
        int length = getCustomLength(input);
        System.out.println("Text ki length hai: " + length);

        // Unique characters find karna
        char[] result = findUniqueChars(input);

        // Result display karna
        System.out.print("Unique characters hain  ");
        for (char c : result) {
            System.out.print(c + " ");
        }

    }
}