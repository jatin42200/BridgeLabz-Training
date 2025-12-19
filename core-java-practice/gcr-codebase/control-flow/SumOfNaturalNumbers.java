import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();//here we take input value for number
        //in if condition here we check that the given number is natural and if it is natural than give sum of all n natural numbers
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " +number+" natural numbers is " +sum);//here we print the total sum 
        } else {
            System.out.println("The number "+number+" is not a natural number");//if no. is not natural
        }
    }
}

