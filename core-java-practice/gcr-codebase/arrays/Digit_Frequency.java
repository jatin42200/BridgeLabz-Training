
import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // here we take input for a number
        long num = sc.nextLong();
        
        // Here we handle negative numbers
        num = Math.abs(num);
        
        // here we find count of digits
        long temp = num;
        int count = 0;
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        
        // here we save digits in array
        int[] digits = new int[count];
        temp = num;
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp = temp / 10;
        }
        
        // here we display the number and its digits
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        // Find frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        
        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " have " + frequency[i] + " frequency in a number");
            }
        }
    }
}