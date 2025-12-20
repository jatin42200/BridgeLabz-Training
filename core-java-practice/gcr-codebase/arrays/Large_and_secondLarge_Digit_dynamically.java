
import java.util.Scanner;

public class Large_and_secondLarge_Digit_dynamically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //here we input a number
        int num = sc.nextInt();

        // Here we handle negative numbers
        num = Math.abs(num);

        int max_Digit = 10;                 // initial capacity
        int[] digits = new int[max_Digit];  // digit storage
        int idx = 0;

        // Extract digits and store dynamically
        while (num != 0) {

            // If array is full, increase size by 10
            if (idx == max_Digit) {
                max_Digit += 10;
                int[] temp = new int[max_Digit];

                // Copy old data into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // reference updated
            }

            digits[idx] = num % 10; // extract digit
            num = num / 10;         // remove digit
            idx++;
        }

        if (idx < 2) {
            System.out.println(" at leat we require more than 2 digit to find largest and second largest");
            return;
        }

        // Find largest and second largest digit
        int largest = 0;
        int second_Largest = 0;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                second_Largest = largest;
                largest = digits[i];
            } else if (digits[i] > second_Largest && digits[i] != largest) {
                second_Largest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second_Largest);
    }
}
