
import java.util.Scanner;

public class Monthly_Calendar {

    //  Method to get month name
    static String getMonthName(int m) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", 
       "July", "August", "September", "October", "November", "December"};
        return months[m];
    }

    //Method to check Leap Year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // b. Method to get total days in a month
    static int getDaysInMonth(int m, int y) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m];
    }

    // Method for First Day using 
    static int getFirstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; // 0-->Sunday, 1-->Monday...
    }

    //here we create main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //taking inputs
        int m = sc.nextInt();//enter month 1 to 12
        int y = sc.nextInt();//enter year

        System.out.println("     " + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(m, y);
        int totalDays = getDaysInMonth(m, y);

        //  First loop for indentation (khali jagah)
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        //  Second loop to print dates
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day); // Right-justified within 3 spaces

            // Saturday ke baad next line (firstDay + current day)
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }
}