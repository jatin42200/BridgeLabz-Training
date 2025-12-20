import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we enter a number
        int power = sc.nextInt();//here we enter a power

        if (num <= 0 || power <= 0) {
            System.out.println("Both number and power must be positive integers");
        } else {
            int result = 1;
            int count = 0;
           //here we calculate the total result
            while (count < power) {
                result=result*num;
                count++;
            }

            System.out.println(result);//here we calculate total result
        }
    }
}
