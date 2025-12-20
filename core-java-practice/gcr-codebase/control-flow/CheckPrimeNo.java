
import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//here we Enter a number

        boolean check = true;//this check variable is checking element it will check given no. is prime or not
        //if number =1 or less than 1 than no. is not pr
        if (num <= 1) {
            check = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
