
import java.util.Scanner;

public class FrequencyOfChar {

    // Method to calculate frequency and return a 2D array
    static String[][] getFrequency(String str) {
        
        int[] counts = new int[256];//Ascii array

        // Loop through text to find frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            counts[ch]++;
        }

        //  Pehle count karte hain kitne unique characters hain for finding array size
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (counts[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        // String array is used because we need to store both char and int
        String[][] resultTable = new String[uniqueCount][2];
        int rowIndex = 0;

        // 5. Loop through original text to maintain order or just loop through ASCII array
        for (int i = 0; i < 256; i++) {
            if (counts[i] > 0) {
                resultTable[rowIndex][0] = String.valueOf((char) i); // Character
                resultTable[rowIndex][1] = String.valueOf(counts[i]); // Frequency
                rowIndex++;
            }
        }

        return resultTable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input
        String input = sc.nextLine();

        // Calling the method
        String[][] frequencyData = getFrequency(input);

        // Display
        System.out.println("\nCharacter | Frequency");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "  |  " + frequencyData[i][1]);
        }
    }
}