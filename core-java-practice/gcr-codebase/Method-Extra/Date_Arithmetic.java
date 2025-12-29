import java.time.*;
import java.util.Scanner;

public class Date_Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input
        System.out.print("Enter date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, 2 years
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Original Date : " + date);
        System.out.println("Final Date    : " + finalDate);

        sc.close();
    }
}

