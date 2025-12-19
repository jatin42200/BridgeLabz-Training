import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //here we input an integer
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("We can't find factorial for negative no.");
        } else {
            long fact = 1;
            int i = 1;

            while (i <= n) {
                fact=fact*i;//here we calculate the factorial of number n
                i++;
            }

            System.out.println("The factorial of "+ n+ " no. is " + fact);
        }
    }
}

