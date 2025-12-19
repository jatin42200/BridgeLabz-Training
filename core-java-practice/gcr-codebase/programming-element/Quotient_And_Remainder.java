import java.util.Scanner;
public class Quotient_And_Remainder {
    public static void main(String[] args) {
        //taking inputs an element of number1 and number2
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int quo = number1/number2;//here we find quotient
        int rem = number1%number2;//here we find reminder
        // print the output
        System.out.println("The Quotient is "+quo+" and Reminder is "+rem+" of two number "+number1+" and " + number2);
    }
}
