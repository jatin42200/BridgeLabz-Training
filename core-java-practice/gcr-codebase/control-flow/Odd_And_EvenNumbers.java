import java.util.Scanner;

public class Odd_And_EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//taking a user input 

        if (num <= 0) {
            System.out.println("The number " + num + " is not a natural number");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {//here we check the no. is even
                    System.out.println(i+" is an even number");
                } else {//here we chek the no. is odd
                    System.out.println(i+" is an odd number");
                }
            }
        }
    }
}
