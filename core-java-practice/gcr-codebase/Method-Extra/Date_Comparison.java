
import java.time.*;
import java.util.Scanner;

public class Date_Comparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // here we take inputs
        LocalDate date1 = LocalDate.parse(sc.nextLine());//in this line we take first date 
        LocalDate date2 = LocalDate.parse(sc.nextLine());//in this line we take Second date 

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are SAME");
        }
    }
}
