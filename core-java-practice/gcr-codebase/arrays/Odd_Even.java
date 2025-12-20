
import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // here we take user input
        int num = sc.nextInt();
        
        // here we check input no. is natural number or not
        if (num < 1) {
            System.out.println("please enter a no. greater than 0");
            return;
        }
        
        // Create arrays for odd and even numbers
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        
        // here we take initial index for odd and even
        int oddIdx = 0;
        int evenIdx = 0;
        
        // Separate odd and even numbers in different arrays
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenIdx] = i;
                evenIdx++;
            } else {
                odd[oddIdx] = i;
                oddIdx++;
            }
        }
        
        // for Printing odd numbers
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(odd[i] + " ");
        }
        
        //for printing even numbers
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(even[i] + " ");
        }
    }
}