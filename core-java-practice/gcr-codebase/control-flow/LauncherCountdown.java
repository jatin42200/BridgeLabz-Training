import java.util.Scanner;

public class Rocket_Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();//here we take input value of counter

        for(int i=counter;i>=1;i--)
        {
            System.out.println(i);//here we print the countdown value
        }
    }
}

