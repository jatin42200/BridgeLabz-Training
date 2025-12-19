import java.util.Scanner;

public class Check_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // here we take input of number 1,2and 3

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        boolean isSmallest = (number1<number2) && (number1<number3);//here we check the smallest number

        // here we print the output
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
