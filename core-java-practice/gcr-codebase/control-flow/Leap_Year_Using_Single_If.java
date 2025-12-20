
import java.util.Scanner;

public class Leap_Year_Using_Single_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();//here we Enter a year
         //here we calculate year is leap year or not
        if (year >= 1582 &&
            (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Year must be 1582 or later");
        }
    }
}
