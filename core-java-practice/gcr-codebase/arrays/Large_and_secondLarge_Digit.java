
import java.util.Scanner;

public class Large_and_secondLarge_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //here we enter a number
        int num=sc.nextInt();

        int maxDigit=10;
        int[]digits=new int[maxDigit];
        int index = 0;

        // Here we handle negative numbers
        num=Math.abs(num);

        // here we store digits in array
        while (num!=0) {
            if (index==maxDigit) {
                break; // array limit reached
            }

            digits[index]=num % 10; // get last digit
            num = num/10;         // remove last digit
            index++;
        }

        if (index<2) {
            System.out.println("there is no enough digit to find largest or second largest");
            return;
        }

        // Find largest and second largest
        int largest=0;
        int secondLargest=0;

        for (int i=0; i<index; i++) {
            if (digits[i]>largest) {
                secondLargest = largest;
                largest=digits[i];
            } else if (digits[i]>secondLargest && digits[i] != largest) {
                secondLargest=digits[i];
            }
        }

        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
