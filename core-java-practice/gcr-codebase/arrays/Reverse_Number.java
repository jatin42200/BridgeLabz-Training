
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //here we enter a number
        int num=sc.nextInt();

        int original_Number=Math.abs(num);

        // here we count digit
        int temp=original_Number;
        int count=0;

        while (temp!=0) {
            count++;
            temp=temp / 10;
        }

        //here we store digit in an array
        int[] digits=new int[count];
        int index=0;

        while (original_Number!=0) {
            digits[index]=original_Number % 10;
            original_Number=original_Number / 10;
            index++;
        }

        //here we create reverse array
        int[]reverse_Digits=new int[count];
        for (int i=0; i<count; i++) {
            reverse_Digits[i]=digits[count - 1 - i];
        }

        // here we display reverse array
        for (int i=0; i<count; i++) {
            System.out.print(reverse_Digits[i]);
        }
    }
}
