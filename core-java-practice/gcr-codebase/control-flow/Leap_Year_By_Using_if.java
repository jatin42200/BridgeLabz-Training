
import java.util.Scanner;

public class Leap_Year_By_Using_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();//Enter a year
     //check given year is leap yr by if and logical operator
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
