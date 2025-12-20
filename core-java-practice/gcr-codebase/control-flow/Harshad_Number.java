import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we enter a number jisko check karenge 

        int originalNum = num;
        int sum = 0;
 
        num = Math.abs(num); // if by mistake input is negative than this line convert it into positive

        while (num != 0) {
            int digit = num % 10; // extract last digit
            sum += digit;
            num = num / 10; //for removing last digit
        }

        if (sum != 0 && originalNum % sum == 0) {
            System.out.println(originalNum + " is a Harshad Number");
        } else {
            System.out.println(originalNum + " is not a Harshad Number");
        }
    }
}
