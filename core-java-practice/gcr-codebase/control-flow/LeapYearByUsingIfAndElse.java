
import java.util.Scanner;

public class LeapYearByUsingIfAndElse  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int year = sc.nextInt();//here we enter a year

        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        } 
        //here in else condition we check given year is leap year or not
        else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}
