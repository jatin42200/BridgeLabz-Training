import java.util.Scanner;

public class Rocket_Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();//here we take input

        while (counter >= 1) {
            System.out.println(counter);//here we print all countdown value
            counter--;
        }
    }
}
