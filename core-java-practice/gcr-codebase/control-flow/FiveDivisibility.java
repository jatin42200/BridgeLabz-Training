 import java.util.Scanner;
public class FiveDivisibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean ischeck = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + ischeck);
    }
}
