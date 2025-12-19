import java.util.Scanner;

public class SumOfNaturalNumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //here we take user input for n
        int n = sc.nextInt();

        if (n > 0) {   //here we check that the number n is Natural number or not
            int Formula_Sum = n * (n + 1);//here we compute sum of n natural no.by using formula
            int Loop_Sum = 0;
            int i = 1;
            while (i <= n) {
                Loop_Sum =Loop_Sum + i;//here we compute sum of n natural no.by using while loop
                i++;
            }

            System.out.println("Sum by using formula " +Formula_Sum);
            System.out.println("Sum by using while loop " +Loop_Sum );

            if (Formula_Sum == Loop_Sum ) {//here we check the result that is calculated by both methods
                System.out.println("result by both method is exactly equal");
            } else {
                System.out.println("result by both method is different");
            }
        } else {
            System.out.println("The number "+n+" is not a natural number");//if number is not natural than this print
        }
}
