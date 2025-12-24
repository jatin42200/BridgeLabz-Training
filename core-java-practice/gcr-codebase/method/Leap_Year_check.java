
import java.util.Scanner;

public class Leap_Year_check {

    // Method to check Leap Year
    static boolean isLeapYear(int year) {

        boolean a = (year % 4 == 0) && (year % 100 != 0);
        boolean b = (year % 400 == 0);

        return a || b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       //here we take input
        int year = sc.nextInt();//enter a year

        if (year < 1582) {
            System.out.println("Leap Year check is valid only for year greater than 1581");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
    }
}
