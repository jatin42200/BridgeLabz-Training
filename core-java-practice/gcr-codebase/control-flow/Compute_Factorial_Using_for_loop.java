import java.util.Scanner;

public class Compute_Factorial_Using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //here we input an integer
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("We can't find factorial for negative no.");
        } else {
            long fact = 1;
            for(int i=1;i<=n;i++)
            {
              fact=fact*i;//here we calculate the factorial of number n by using for loop
            }

            System.out.println("The factorial of "+ n+ " no. is " + fact);
        }
    }
}


