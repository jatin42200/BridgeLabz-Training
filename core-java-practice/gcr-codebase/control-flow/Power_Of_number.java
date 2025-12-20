import java.util.Scanner;

public class Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we enter a number
        int power = sc.nextInt();//here we enter a power

        if (num <= 0 || power <= 0) {
            System.out.println("Both number and power must be positive integers");//if by mistake user give negative power or number
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result=result*num;//here we calculate the power
            }

            System.out.println( result);//here we print the result
        }
    }
}

