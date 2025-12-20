import java.util.Scanner;

public class Multiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Enter a number

        if (num <= 0 || num >= 100) {
            System.out.println("Please enter a positive integer less than 100");//if number is not in a range than we can give this message
        } else {
            System.out.println("Multiples of " + num + " below 100 are ");

            for (int i = 99; i >= 1; i--) {   //print all number that is below 100
                if (i % num == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
